package com.example.design_pattern.adapter_pattern.turkey;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧게밖에 못납니다요");
    }
}
