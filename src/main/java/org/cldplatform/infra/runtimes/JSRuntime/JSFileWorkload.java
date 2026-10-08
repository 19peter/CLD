package org.cldplatform.infra.runtimes.JSRuntime;

import org.cldplatform.infra.runtimes.Workload;

public record JSFileWorkload(String filePath) implements Workload {}
