package com.example.design_pattern.factory_pattern;

import com.example.design_pattern.factory_pattern.pizza.Pizza;
import com.example.design_pattern.factory_pattern.store.ChicagoPizzaStore;
import com.example.design_pattern.factory_pattern.store.NYPizzaStore;
import com.example.design_pattern.factory_pattern.store.PizzaStore;

public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("NYCheese");
        System.out.println("A가 주문한 피자 :" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("CHCheese");
        System.out.println("B가 주문한 피자 :" + pizza.getName() + "\n");
    }

}
