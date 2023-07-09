package com.example.design_pattern.command_pattern.receiver;

public class Fan { // 선풍기!
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    public Fan() {
        this.speed = OFF; // 초기에는 꺼진 상태로 시작합시다
    }

    public void setHigh(){
        this.speed = HIGH;
    }
    public void setMedium(){
        this.speed = MEDIUM;
    }
    public void setLow(){
        this.speed = LOW;
    }
    public void setOff(){
        this.speed = OFF;
    }

    public int getSpeed(){
        return this.speed;
    }
}
