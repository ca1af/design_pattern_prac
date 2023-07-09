package com.example.design_pattern.command_pattern.receiver;

public class Stereo {
    int volume;
    public void on(){
        System.out.println("스테레오를 켭니다");
    }

    public void setCD(){
        System.out.println("CD를 설정합니다.");
    }
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("볼륨이 " + volume + "으로 설정되었습니다.");
    }
}
