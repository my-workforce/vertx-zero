package io.vertx.tp.plugin.job;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.up.atom.worker.Mission;

import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public interface JobClient {
    /*
     * Create local session store bind data
     */
    static JobClient createShared(final Vertx vertx, final JsonObject config) {
        return new JobClientImpl(vertx, config);
    }

    static JobClient createShared(final Vertx vertx) {
        return new JobClientImpl(vertx, new JsonObject());
    }

    // ========================== UxJob mount
    /* Start new job */
    @Fluent
    JobClient startAsync(String code, Handler<AsyncResult<Long>> handler);

    /* Start */
    Future<Long> startAsync(String code);

    /* Stop running job */
    @Fluent
    JobClient stopAsync(String code, Handler<AsyncResult<Boolean>> handler);

    /* Stop */
    Future<Boolean> stopAsync(String code);

    /* Resume a failure job */
    @Fluent
    JobClient resumeAsync(String code, Handler<AsyncResult<Long>> handler);

    /* Resume */
    Future<Long> resumeAsync(String timerId);

    // ========================== UxJob crud
    /* Fetch Single **/
    @Fluent
    JobClient fetchAsync(String code, Handler<AsyncResult<Mission>> handler);

    /* Fetch List */
    @Fluent
    JobClient fetchAsync(Set<String> code, Handler<AsyncResult<List<Mission>>> handler);

    /* Fetch */
    Future<Mission> fetchAsync(String code);

    /* Fetch List */
    Future<List<Mission>> fetchAsync(Set<String> codes);

    Mission fetch(String code);

    List<Mission> fetch(Set<String> codes);

    @Fluent
    JobClient saveAsync(Set<Mission> missions, Handler<AsyncResult<Set<Mission>>> handler);

    Future<Set<Mission>> saveAsync(Set<Mission> missions);

    /* Save Mission */
    @Fluent
    JobClient saveAsync(Mission mission, Handler<AsyncResult<Mission>> handler);

    /* Save */
    Future<Mission> saveAsync(Mission mission);


    Set<Mission> save(Set<Mission> missions);

    Mission save(Mission mission);

    /* Remove */
    @Fluent
    JobClient removeAsync(String code, Handler<AsyncResult<Mission>> handler);

    /* Delete */
    Future<Mission> removeAsync(String code);

    Mission remove(String code);
}
