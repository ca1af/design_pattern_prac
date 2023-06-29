package com.example.design_pattern.singleton_pattern.singleton;

public class MiddleAgeSingleton {
    private static MiddleAgeSingleton uniqueInstance; // 방법1
    private volatile static MiddleAgeSingleton volatileUniqueInstance; // 방법3
    public static synchronized MiddleAgeSingleton getInstance1(){ // 방법 1
        if (uniqueInstance == null){
            uniqueInstance = new MiddleAgeSingleton();
        }
        return uniqueInstance;
    }
    public static MiddleAgeSingleton getInstance3(){ // 방법3
        if (volatileUniqueInstance == null){
            synchronized (MiddleAgeSingleton.class) {
                if (volatileUniqueInstance == null){
                    volatileUniqueInstance = new MiddleAgeSingleton();
                }
            }
        }
        return volatileUniqueInstance;
    }
    private static final MiddleAgeSingleton readyMadeUniqueInstance = new MiddleAgeSingleton(); // 방법 2
    public static MiddleAgeSingleton getInstance2(){
        return readyMadeUniqueInstance;
    }
}
