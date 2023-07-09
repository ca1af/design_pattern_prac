package com.example.design_pattern.command_pattern.client;

import com.example.design_pattern.command_pattern.command.LightOnCommand;
import com.example.design_pattern.command_pattern.receiver.Light;

public class SimpleInvoker {
    public static void main(String[] args) {
        com.example.design_pattern.command_pattern.invoker.SimpleInvoker simpleInvoker = new com.example.design_pattern.command_pattern.invoker.SimpleInvoker();
        // Invoker 는 리모컨이라고 생각하면 됩니다.
        Light light = new Light();
        // Receiver 인 Light 객체입니다. 리시버는 유연하게 확장 가능합니다.
        LightOnCommand turnLightOn = new LightOnCommand(light);
        // Command 인터페이스의 구현체입니다. 생성시에 Receiver 를 전달받아 생성됩니다.

        simpleInvoker.setCommand(turnLightOn);
        simpleInvoker.executeCommand();
    }
}
