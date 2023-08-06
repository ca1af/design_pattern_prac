package com.example.design_pattern.facade_pattern.theater;

public class Popper {
    public void on(){
        System.out.println("팝콘 기계 킨다!");
    }

    public void off(){
        System.out.println("팝콘 기계 끈다!");
    }

    public void pop() {
        System.out.println("팝콘 튀긴다!");
    }
}
