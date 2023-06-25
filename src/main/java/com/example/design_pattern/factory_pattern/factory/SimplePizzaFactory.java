package com.example.design_pattern.factory_pattern.factory;

import com.example.design_pattern.factory_pattern.pizza.NYCheesePizza;
import com.example.design_pattern.factory_pattern.pizza.NYPeperoniPizza;
import com.example.design_pattern.factory_pattern.pizza.ChicagoCheesePizza;
import com.example.design_pattern.factory_pattern.pizza.Pizza;

import java.util.NoSuchElementException;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "peperoni" -> new NYPeperoniPizza();
            case "pineapple" -> new ChicagoCheesePizza();
            default -> throw new NoSuchElementException("그런 피자는 없어요!");
        };

        return pizza;
    }
}
