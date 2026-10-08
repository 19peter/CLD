package org.cldplatform;

import org.cldplatform.cmd.CommandDispatcher;
import org.cldplatform.cmd.DaemonServer;
import org.cldplatform.global.db.Memdb;
import org.cldplatform.global.dns.Dns;

public class Main {
    public static void main(String[] args) {
        Memdb.init();
        Dns.init();
        CommandDispatcher.init();
        DaemonServer.start();
    }
}