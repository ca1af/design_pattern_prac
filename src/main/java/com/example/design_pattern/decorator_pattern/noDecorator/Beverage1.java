package com.example.design_pattern.decorator_pattern.noDecorator;

public abstract class Beverage1 {
    String description;

    public String getDescription(){
        return this.description;
    }

    abstract double cost();
}
