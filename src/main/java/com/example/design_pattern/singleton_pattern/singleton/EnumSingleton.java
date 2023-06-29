package com.example.design_pattern.singleton_pattern.singleton;

public class EnumSingleton {
    public enum SingletonEnum {
        UNIQUE_INSTANCE;
    }

    static class SingletonClient {
        public static void main(String[] args) {
            SingletonEnum enumSingleton = SingletonEnum.UNIQUE_INSTANCE;
        }
    }
}
