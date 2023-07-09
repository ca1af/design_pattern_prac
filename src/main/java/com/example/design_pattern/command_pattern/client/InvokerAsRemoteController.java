package com.example.design_pattern.command_pattern.client;

import com.example.design_pattern.command_pattern.command.LightOffCommand;
import com.example.design_pattern.command_pattern.command.LightOnCommand;
import com.example.design_pattern.command_pattern.command.StereoOffCommand;
import com.example.design_pattern.command_pattern.command.StereoOnWithCDCommand;
import com.example.design_pattern.command_pattern.invoker.Invoker;
import com.example.design_pattern.command_pattern.receiver.Light;
import com.example.design_pattern.command_pattern.receiver.Stereo;

public class InvokerAsRemoteController {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        // 조명을 켜고 끄는 기능의 리시버 Light 와, Command 구현체들 초기화
        Light light = new Light();
        LightOnCommand turnLightOn = new LightOnCommand(light);
        LightOffCommand turnLightOff = new LightOffCommand(light);

        // 스테레오 온오프 기능의 리시버 Stereo 와, Command 구현체들 초기화
        Stereo stereo = new Stereo();
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        // invoker 배열에 구현체 커맨드를 매치시켜준다.
        invoker.setCommand(1, turnLightOn, turnLightOff); // 1번 슬롯을 라이트 온오프로 설정
        invoker.setCommand(2, stereoOnWithCD, stereoOff); // 2번 슬롯을 스테레오 온오프로 설정

        // 실제 호출부
        invoker.onButtonWasPushed(2);
        invoker.offButtonWasPushed(2);

        invoker.onButtonWasPushed(1);
        invoker.offButtonWasPushed(1);

        // undo 를 추가해봅시다
        // 마지막에 1번 버튼을 off 로 눌렀으니, 다시 on 되어야 합니다.
        System.out.println("------ 언두 테스트는 아래에! ------");
        invoker.undoButtonWasPushed();
    }
}
