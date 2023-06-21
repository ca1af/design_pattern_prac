package com.example.design_pattern.strategy_pattern.duck;

import com.example.design_pattern.strategy_pattern.behavior.fly.CanFly;
import com.example.design_pattern.strategy_pattern.behavior.quack.Quack;

public class RealDuck extends Duck{
    @Override
    public void display() {
        System.out.println("판사님 저는 진짜 오리입니다");
    }

    public RealDuck() {
        quackBehavior = new Quack();
        flyBehavior = new CanFly();
    }
}
