package io.vertx.tp.plugin.shared;

import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.shareddata.AsyncMap;
import io.vertx.core.shareddata.LocalMap;
import io.vertx.core.shareddata.SharedData;
import io.vertx.up.atom.Kv;
import io.vertx.up.exception.WebException;
import io.vertx.up.exception.web._500SharedDataModeException;
import io.vertx.up.fn.Fn;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.cache.Cc;

import java.util.Objects;
import java.util.Set;

@SuppressWarnings("all")
public class SharedClientImpl<K, V> implements SharedClient<K, V> {

    private static final Annal LOGGER = Annal.get(SharedClientImpl.class);

    private static final Cc<String, SharedClient> CC_CLIENTS = Cc.open();

    private final transient Vertx vertx;
    private transient LocalMap<K, V> syncMap;
    private transient AsyncMap<K, V> asyncMap;
    private transient String poolName;

    SharedClientImpl(final Vertx vertx, final String name) {
        this.vertx = vertx;
        this.poolName = name;
    }

    public static <K, V> SharedClient<K, V> create(final Vertx vertx, final String name) {
        return CC_CLIENTS.pick(() -> new SharedClientImpl(vertx, name), name);
        // return Fn.po?l(CLIENTS, name, () -> new SharedClientImpl(vertx, name));
    }

    private void async(final Handler<AsyncResult<AsyncMap<K, V>>> handler) {
        if (Objects.isNull(this.asyncMap)) {
            final SharedData sd = this.vertx.sharedData();
            // Async map created
            LOGGER.info(Info.INFO_ASYNC_START);
            sd.<K, V>getAsyncMap(this.poolName, res -> {
                if (res.succeeded()) {
                    this.asyncMap = res.result();
                    LOGGER.info(Info.INFO_ASYNC_END, String.valueOf(this.asyncMap.hashCode()), this.poolName);
                    handler.handle(Future.succeededFuture(res.result()));
                } else {
                    final WebException error = new _500SharedDataModeException(getClass(), res.cause());
                    handler.handle(Future.failedFuture(error));
                }
            });
        } else {
            handler.handle(Future.succeededFuture(this.asyncMap));
        }
    }

    private LocalMap<K, V> sync() {
        if (Objects.isNull(this.syncMap)) {
            final SharedData sd = this.vertx.sharedData();
            // Sync map created
            this.syncMap = sd.getLocalMap(this.poolName);
            LOGGER.info(Info.INFO_SYNC, String.valueOf(this.syncMap.hashCode()), this.poolName);
        }
        return this.syncMap;
    }

    @Override
    public SharedClient<K, V> switchClient(final String name) {
        return SharedClientImpl.create(this.vertx, name);
    }

    @Override
    public Kv<K, V> put(final K key, final V value) {
        final V reference = this.sync().get(key);
        // Add & Replace
        Fn.safeSemi(null == reference, LOGGER,
            () -> this.sync().put(key, value),
            () -> this.sync().replace(key, value));
        return Kv.create(key, value);
    }

    @Override
    public Kv<K, V> put(final K key, final V value, final int seconds) {
        Kv<K, V> result = this.put(key, value);
        LOGGER.info(Info.INFO_TIMER_PUT, String.valueOf(key), String.valueOf(seconds));
        this.vertx.setTimer(seconds * 1000, id -> {
            final V existing = this.get(key);
            if (Objects.nonNull(existing)) {
                LOGGER.info(Info.INFO_TIMER_EXPIRE, String.valueOf(key));
                this.remove(key);
            } else {
                LOGGER.info(Info.INFO_TIMER_REMOVED, String.valueOf(key));
            }
        });
        return result;
    }

    @Override
    public SharedClient<K, V> put(final K key, final V value,
                                  final Handler<AsyncResult<Kv<K, V>>> handler) {
        this.async(map -> map.result().get(key, res -> {
            if (res.succeeded()) {
                final V reference = res.result();
                Fn.safeSemi(null == reference, LOGGER,
                    () -> map.result().put(key, value, added -> {
                        if (added.succeeded()) {
                            handler.handle(Future.succeededFuture(Kv.create(key, value)));
                        } else {
                            final WebException error = new _500SharedDataModeException(getClass(), added.cause());
                            handler.handle(Future.failedFuture(error));
                        }
                    }),
                    () -> map.result().replace(key, value, replaced -> {
                        if (replaced.succeeded()) {
                            handler.handle(Future.succeededFuture(Kv.create(key, value)));
                        } else {
                            final WebException error = new _500SharedDataModeException(getClass(), replaced.cause());
                            handler.handle(Future.failedFuture(error));
                        }
                    }));
            } else {
                final WebException error = new _500SharedDataModeException(getClass(), res.cause());
                handler.handle(Future.failedFuture(error));
            }
        }));
        return this;
    }

    @Override
    public SharedClient<K, V> put(final K key, final V value, final int seconds,
                                  final Handler<AsyncResult<Kv<K, V>>> handler) {
        final SharedClient<K, V> reference = this.put(key, value, handler);
        LOGGER.info(Info.INFO_TIMER_PUT, String.valueOf(key), String.valueOf(seconds));
        this.vertx.setTimer(seconds * 1000, id -> this.remove(key, res -> LOGGER.info(Info.INFO_TIMER_EXPIRE, key)));
        return reference;
    }

    @Override
    public Kv<K, V> remove(final K key) {
        final V removed = this.sync().remove(key);
        return Kv.create(key, removed);
    }

    @Override
    public V get(final K key) {
        return this.sync().get(key);
    }

    @Override
    public boolean clear() {
        this.sync().clear();
        return true;
    }

    @Override
    public V get(final K key, final boolean once) {
        final V value = this.get(key);
        if (once) {
            this.remove(key);
        }
        return value;
    }

    @Override
    public SharedClient<K, V> remove(final K key,
                                     final Handler<AsyncResult<Kv<K, V>>> handler) {
        this.async(map -> map.result().remove(key, res -> {
            if (res.succeeded()) {
                final V reference = res.result();
                handler.handle(Future.succeededFuture(Kv.create(key, reference)));
            } else {
                final WebException error = new _500SharedDataModeException(getClass(), res.cause());
                handler.handle(Future.failedFuture(error));
            }
        }));
        return this;
    }

    @Override
    public SharedClient<K, V> get(final K key,
                                  final Handler<AsyncResult<V>> handler) {
        this.async(map -> map.result().get(key, handler));
        return this;
    }

    @Override
    public SharedClient<K, V> get(K key, boolean once,
                                  Handler<AsyncResult<V>> handler) {
        final SharedClient<K, V> reference = this.get(key, handler);
        if (once) {
            this.async(map -> map.result().remove(key, handler));
        }
        return reference;
    }

    @Override
    public SharedClient<K, V> clear(Handler<AsyncResult<Boolean>> handler) {
        this.async(map -> map.result().clear(result -> handler.handle(Future.succeededFuture(Boolean.TRUE))));
        return this;
    }

    /*
     * Shared Enhancement for
     *
     * 1) Session Management
     * 2) Cache Management
     * 3) Login/Logout Management
     */
    @Override
    public SharedClient<K, V> size(Handler<AsyncResult<Integer>> handler) {
        this.async(map -> map.result().size(handler));
        return this;
    }

    @Override
    public SharedClient<K, V> keys(Handler<AsyncResult<Set<K>>> handler) {
        this.async(map -> map.result().keys(handler));
        return this;
    }

    @Override
    public int size() {
        return this.sync().size();
    }

    @Override
    public Set<K> keys() {
        return this.sync().keySet();
    }
}