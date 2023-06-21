package com.example.design_pattern.strategy_pattern.behavior.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
