package com.example.design_pattern.strategy_pattern.behavior.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<아무일도 일어나지 않았다>");
    }
}
