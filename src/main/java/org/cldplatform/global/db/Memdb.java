package org.cldplatform.global.db;



import org.cldplatform.infra.runtimes.RuntimeInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Memdb {
    private static final Map<String, RuntimeInterface> services = new ConcurrentHashMap<>();

    static {

    }

    public static void init() {

    }

    public RuntimeInterface getInstance(String id) {
        return services.get(id);
    }
}
