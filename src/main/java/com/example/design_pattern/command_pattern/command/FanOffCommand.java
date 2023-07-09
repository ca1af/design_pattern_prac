package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Fan;

public class FanOffCommand implements Command{
    private final Fan fan;
    private int prevSpeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed();
        fan.setOff();
        System.out.println("off 커맨드 선택되었습니다.");
        System.out.println("이전 스피드는 " + prevSpeed + "이며, 속도가 " + fan.getSpeed() + " 로 변경되었습니다.");
    }

    @Override
    public void undo() {
        System.out.println("undo 커맨드 선택되었습니다.");
        if (prevSpeed == Fan.HIGH) { // 작업 취소 부분입니다. 이런 느낌으로 쭉쭉 추가 가능합니다.
            fan.setHigh();
            System.out.println("이전 스피드는 " + prevSpeed + "이며, 속도가 " + fan.getSpeed() + " 로 변경되었습니다.");
        } else if (prevSpeed == Fan.MEDIUM){
            fan.setMedium();
            System.out.println("이전 스피드는 " + prevSpeed + "이며, 속도가 " + fan.getSpeed() + " 로 변경되었습니다.");
        }
    }
}
