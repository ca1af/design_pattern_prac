package com.example.design_pattern.decorator_pattern.decorator;

import com.example.design_pattern.decorator_pattern.component.Beverage;

public class Mocha extends Decorator{ // Decorator 는 Beverage(Component) 를 확장한다.
    public Mocha(Beverage previousBeverage){
        this.beverage = previousBeverage;
        // 생성자 매서드를 통해서 매개변수로 들어온 previousBeverage 가 필드의 인스턴스 변수가 된다
        // Decorator 클래스의 인스턴스 변수 (필드 변수) 로 선언한 beverage 가 된다.
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
        // getDescription 매서드를 통해 이전에 있던 음료(혹은 데코레이터) 설명 호출 후 덧붙이기
    }
}
