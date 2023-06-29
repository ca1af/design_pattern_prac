package com.example.design_pattern.singleton_pattern.singleton;

public class HolderSingleton {

    private HolderSingleton() {
        // private 생성자
    }

    private static class SingletonHolder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
