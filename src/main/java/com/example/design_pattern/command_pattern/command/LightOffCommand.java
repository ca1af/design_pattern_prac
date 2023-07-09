package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Light;

public class LightOffCommand implements Command{
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
