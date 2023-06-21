package com.example.design_pattern.strategy_pattern.behavior.quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
