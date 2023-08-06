package com.example.design_pattern.adapter_pattern;

import com.example.design_pattern.adapter_pattern.adapter.TurkeyAdapter;
import com.example.design_pattern.adapter_pattern.duck.Duck;
import com.example.design_pattern.adapter_pattern.duck.MallardDuck;
import com.example.design_pattern.adapter_pattern.turkey.Turkey;
import com.example.design_pattern.adapter_pattern.turkey.WildTurkey;

public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        // 터키 객체를 어댑터로 감싸서 Duck 객체처럼 보이게 만듭니다.

        System.out.println("=====칠면조입니다=====");
        turkey.gobble();
        turkey.fly();
        System.out.println("==================");

        System.out.println("=====오리입니다=====");
        duck.quack();
        duck.fly();
        System.out.println("==================");

        System.out.println("=====칠면조 어댑터입니다=====");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        System.out.println("==================");
    }
}
