package org.cldplatform.infra.runtimes;

public interface RuntimeInterface {
    void boot();
    String submit(Workload workload);
    void stop();
}
