package com.example.design_pattern.strategy_pattern.behavior.fly;

public class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("못 난다 말이야!");
    }
}
