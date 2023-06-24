package com.example.design_pattern.decorator_pattern.decorator;

import com.example.design_pattern.decorator_pattern.component.Beverage;

public class Whip extends Decorator{
    public Whip(Beverage previousBeverage) {
        this.beverage = previousBeverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
