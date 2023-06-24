package com.example.design_pattern.decorator_pattern.component;

public class Espresso extends Beverage{

    public Espresso() {
        description = "에스프레소"; // 생성자 메소드를 통해서 description 필드 초기화
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
