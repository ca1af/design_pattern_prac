package com.example.design_pattern.decorator_pattern.noDecorator;

public class Espresso1 extends Beverage1{
    @Override
    public String getDescription(){
        return "저는 에스프레소입니다.";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
