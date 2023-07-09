package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Fan;

public class FanHighCommand implements Command{
    private Fan fan;
    int prevSpeed; // 상태를 저장해줄 생각입니다.

    public FanHighCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        prevSpeed = fan.getSpeed(); // 팬 객체에 에 이미 저장되어있는, 이전 스피드를 가져옵니다.
        fan.setHigh();
        System.out.println("High 커맨드 선택되었습니다.");
        System.out.println("이전 스피드는 " + prevSpeed + "이며, 속도가 " + fan.getSpeed() + " 로 변경되었습니다.");
    }

    @Override
    public void undo() {
        System.out.println("undo 커맨드 선택되었습니다.");
        if (prevSpeed == Fan.OFF) { // 작업 취소 부분입니다. 이런 느낌으로 쭉쭉 추가 가능합니다.
            fan.setOff();
            System.out.println("이전 스피드는 " + prevSpeed + "이며, 속도가 " + fan.getSpeed() + " 로 변경되었습니다.");
        } else if (prevSpeed == Fan.HIGH){
            fan.setHigh();
        }
    }
}
