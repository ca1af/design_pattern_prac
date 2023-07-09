package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Light;

public class LightOnCommand implements Command{
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff(); // on 의 undo 는 turnOff 이므로!
    }
}
