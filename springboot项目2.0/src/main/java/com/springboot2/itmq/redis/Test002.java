package com.springboot2.itmq.redis;

public class Test002 {
    public static void main(String[] args) {
        LockService lockService = new LockService();
        for (int i = 0; i < 2; i++) {
            new ThreadRedis(lockService).start();
        }
    }
}
