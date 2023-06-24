package com.example.design_pattern.decorator_pattern.component;

public abstract class Beverage {
    String description = "음료류!";

    public String getDescription(){
        return this.description; // getter 매서드는 구현체들도 공유하므로, 선언한다.
    }

    public abstract double cost(); // Beverage의 구현체들은 가격 매서드를 구현해야 한다.
}
