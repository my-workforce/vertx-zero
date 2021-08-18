package io.vertx.up.uca.rs.hunt.adaptor;

import io.vertx.up.log.Annal;

import javax.ws.rs.core.MediaType;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WingSelector {

    public static Wings end(final String contentType, final Set<MediaType> produces) {
        /*
         * content type
         * accept
         */
        final MediaType type;
        if (Objects.isNull(contentType)) {
            /*
             * Default String mode
             *
             * 1. Content-Type is `* / *` format
             * 2. Replied body directly
             */
            type = MediaType.WILDCARD_TYPE;
        } else {
            /*
             * Extract the data `MediaType` from response header
             */
            type = MediaType.valueOf(contentType);
        }
        /*
         * 1. type for first level
         * 2. subtype for second level
         */
        final ConcurrentMap<String, Supplier<Wings>> subtype = Pool.SELECT_POOL.get(type.getType());
        final Wings selected;
        if (Objects.isNull(subtype) || subtype.isEmpty()) {
            selected = Pool.SELECT_POOL.get(MediaType.APPLICATION_JSON_TYPE.getType())
                    .get(MediaType.APPLICATION_JSON_TYPE.getSubtype()).get();
        } else {
            final Supplier<Wings> wings = subtype.get(type.getSubtype());
            selected = Objects.isNull(wings) ? new JsonWings() : wings.get();
        }
        final Annal logger = Annal.get(WingSelector.class);
        logger.info("Wings response selected `{0}` for content type {1}, mime = {2}, hashCode = {3}",
                selected.getClass().getName(), contentType, type.toString(), String.valueOf(selected.hashCode()));
        return selected;
    }
}
