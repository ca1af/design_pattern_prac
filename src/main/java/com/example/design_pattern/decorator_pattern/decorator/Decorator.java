package com.example.design_pattern.decorator_pattern.decorator;

import com.example.design_pattern.decorator_pattern.component.Beverage;

public abstract class Decorator extends Beverage {
    Beverage beverage; // 데코레이터가 감쌀 음료 객체를 정한다
    public abstract String getDescription(); // 모든 첨가물에도 Description 을 새로 구현하도록 만들것이다.
}
