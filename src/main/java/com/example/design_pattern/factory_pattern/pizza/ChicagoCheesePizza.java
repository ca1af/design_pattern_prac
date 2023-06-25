package com.example.design_pattern.factory_pattern.pizza;

public class ChicagoCheesePizza extends Pizza{
    public ChicagoCheesePizza() {
        name = "시카고 딥 디쉬 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼 토마토 소스";

        toppings.add("잘게 조각낸 모짜렐라 치즈");
    }

    @Override
    public void cut() {
        System.out.println("네모낳게 잘라볼게요~ //오버라이드 됐어요!//");
    }
}
