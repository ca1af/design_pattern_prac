package com.example.design_pattern.decorator_pattern.noDecorator;

public class Decaf extends Beverage1{
    @Override
    public String getDescription(){
        return "저는 디카페인이에요";
    }
    @Override
    double cost() {
        return 1.20;
    }
}
