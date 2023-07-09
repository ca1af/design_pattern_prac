package com.example.design_pattern.command_pattern.client;

import com.example.design_pattern.command_pattern.command.FanHighCommand;
import com.example.design_pattern.command_pattern.command.FanOffCommand;
import com.example.design_pattern.command_pattern.invoker.Invoker;
import com.example.design_pattern.command_pattern.receiver.Fan;

public class FanInvokerTest {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Fan fan = new Fan();
        FanHighCommand command = new FanHighCommand(fan);
        FanOffCommand offCommand = new FanOffCommand(fan);

        invoker.setCommand(3, command, offCommand);
        invoker.onButtonWasPushed(3);
        invoker.undoButtonWasPushed();
    }
}
