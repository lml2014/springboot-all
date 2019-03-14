package com.lml.boot.dubbo.consumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ConsumerTest {

    @Test
    void memory() {
        Runtime runtime = Runtime.getRuntime();
        long freeMemory = runtime.freeMemory();
        long totalMemory = runtime.totalMemory();
        long maxMemory = runtime.maxMemory();
        boolean ok = maxMemory - (totalMemory - freeMemory) > 2048L;
        String msg = "max:" + maxMemory / 1024L / 1024L + "M,total:" + totalMemory / 1024L / 1024L + "M,used:" + (totalMemory / 1024L / 1024L - freeMemory / 1024L / 1024L) + "M,free:" + freeMemory / 1024L / 1024L + "M";
        System.out.println(msg);
        assertTrue(ok);
    }
}