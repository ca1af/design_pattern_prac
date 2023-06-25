package com.example.design_pattern.factory_pattern.store;

import com.example.design_pattern.factory_pattern.pizza.NYCheesePizza;
import com.example.design_pattern.factory_pattern.pizza.NYPeperoniPizza;
import com.example.design_pattern.factory_pattern.pizza.Pizza;

import java.util.NoSuchElementException;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("NYCheese")){
            pizza = new NYCheesePizza();
        } else if (type.equals("NYPeperoni")){
            pizza = new NYPeperoniPizza();
        } else {
            throw new NoSuchElementException("그런 건 없어요!");
        }
        return pizza;
    }
}
