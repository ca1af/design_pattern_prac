package com.example.design_pattern.strategy_pattern.duck;

import com.example.design_pattern.strategy_pattern.behavior.fly.FlyBehavior;
import com.example.design_pattern.strategy_pattern.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public abstract void display();
    public void performFly(){
        flyBehavior.fly();
        // flyBehavior 에는 1. 난다, 2. 못난다 조정. (고무오리, 청동오리 ...)
    }

    public void performQuack(){
        quackBehavior.quack();
        // quackBehavior 는 1. 꽥! (청둥오리) 2. 삑! (고무오리==러버덕) 3. 무음 (나무오리)
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜬다!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
