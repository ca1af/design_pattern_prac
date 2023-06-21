package com.example.design_pattern.strategy_pattern;

import com.example.design_pattern.strategy_pattern.behavior.fly.CantFly;
import com.example.design_pattern.strategy_pattern.behavior.quack.Squeak;
import com.example.design_pattern.strategy_pattern.duck.Duck;
import com.example.design_pattern.strategy_pattern.duck.RealDuck;

public class DuckTester {
    public static void main(String[] args) {
        Duck duck = new RealDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();

        System.out.println("----RealDuck 이 못 날고, 삑삑 하고 울면 재밌지 않을까요?----");

        duck.setFlyBehavior(new CantFly());
        duck.setQuackBehavior(new Squeak());

        duck.performFly();
        duck.performQuack();
    }
}
