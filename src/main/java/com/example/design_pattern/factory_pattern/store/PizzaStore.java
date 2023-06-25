package com.example.design_pattern.factory_pattern.store;

import com.example.design_pattern.factory_pattern.pizza.Pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
