package com.example.design_pattern.factory_pattern.store;

import com.example.design_pattern.factory_pattern.pizza.NYCheesePizza;
import com.example.design_pattern.factory_pattern.pizza.NYPeperoniPizza;
import com.example.design_pattern.factory_pattern.pizza.ChicagoCheesePizza;
import com.example.design_pattern.factory_pattern.pizza.Pizza;

public class OrderPizza {
    Pizza orderPizza(String type){
        Pizza pizza = switch (type) {
            case "cheese" -> new NYCheesePizza();
            case "peperoni" -> new NYPeperoniPizza();
            case "pineapple" -> new ChicagoCheesePizza();
            default -> throw new NullPointerException("그런 피자는 없어요!");
        };

//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();

        return pizza;
    }
}
