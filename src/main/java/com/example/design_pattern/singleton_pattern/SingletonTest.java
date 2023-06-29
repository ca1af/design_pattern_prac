package com.example.design_pattern.singleton_pattern;

import com.example.design_pattern.singleton_pattern.singleton.EnumSingleton;
import com.example.design_pattern.singleton_pattern.singleton.OldSingleton;

public class SingletonTest {
    static class SingletonThreadTest {
        public static void main(String[] args) {
            final int numThreads = 5; // 생성할 스레드 수

            Runnable runnable = () -> {
                OldSingleton singleton = OldSingleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ": " + singleton);
            };

            Thread[] threads = new Thread[numThreads];

            for (int i = 0; i < numThreads; i++) {
                threads[i] = new Thread(runnable);
                threads[i].start();
            }
        }
    }

    static class EnumSingletonTest {
        public static void main(String[] args) {
        }
    }


}

