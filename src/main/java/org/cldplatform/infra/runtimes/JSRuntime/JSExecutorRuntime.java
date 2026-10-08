package org.cldplatform.infra.runtimes.JSRuntime;

import org.cldplatform.infra.runtimes.RuntimeInterface;
import org.cldplatform.infra.runtimes.Workload;
import org.graalvm.polyglot.Context;
public class JSExecutorRuntime implements RuntimeInterface {

    @Override
    public void boot() {
        
    }

    @Override
    public String submit(Workload workload) {
        return "";
    }

    @Override
    public void stop() {

    }
}

