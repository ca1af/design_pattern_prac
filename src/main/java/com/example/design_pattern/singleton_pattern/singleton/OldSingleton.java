package com.example.design_pattern.singleton_pattern.singleton;

public class OldSingleton {
    private static OldSingleton uniqueInstance;

    private OldSingleton() {} // 생성자 매서드

    public static OldSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new OldSingleton();
        }
        return uniqueInstance;
    }
}
