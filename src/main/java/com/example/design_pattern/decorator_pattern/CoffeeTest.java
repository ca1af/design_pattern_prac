package com.example.design_pattern.decorator_pattern;

import com.example.design_pattern.decorator_pattern.component.Beverage;
import com.example.design_pattern.decorator_pattern.component.Espresso;
import com.example.design_pattern.decorator_pattern.component.HouseBlend;
import com.example.design_pattern.decorator_pattern.decorator.Mocha;
import com.example.design_pattern.decorator_pattern.decorator.Whip;

public class CoffeeTest {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " 가격은 (" + beverage.cost() + ") 입니다~");
        // 에스프레소 가격은 1.99

        Beverage beverage2 = new HouseBlend();
        // 가격은 0.89
        beverage2 = new Mocha(beverage2);
        // 가격은 0.2
        beverage2 = new Whip(beverage2);
        // 가격은 0.2
        System.out.println(beverage2.getDescription() + " 가격은 (" + beverage2.cost() + ") 입니다~");
    }
}
