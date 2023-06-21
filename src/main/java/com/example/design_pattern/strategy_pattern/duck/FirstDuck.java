package com.example.design_pattern.strategy_pattern.duck;

public abstract class FirstDuck {
    public void fly(){
        System.out.println("날고있어요!");
    }

    public void quack(){
        System.out.println("꽥!");
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜬다!");
    }

    public FirstDuck(){} // 생성자

    public abstract void display(); // "내가 어떤 오리인가"를 보여주는 매서드
}
