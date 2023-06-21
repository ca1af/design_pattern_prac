package com.example.design_pattern.strategy_pattern.duck;

public class RubberDuck extends FirstDuck{
    @Override
    public void display() {
        System.out.println("저는 고무오리입니다");
    }
    @Override
    public void quack(){
        System.out.println("삑!");
    }

    @Override
    public void fly(){
        System.out.println("<아무일도 일어나지 않았다>");
    }
}
