package com.example.design_pattern.strategy_pattern.behavior.fly;

public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날 수 있다말이야!");
    }
}
