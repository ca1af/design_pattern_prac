package com.example.design_pattern.command_pattern.invoker;

import com.example.design_pattern.command_pattern.command.Command;

public class SimpleInvoker {
    private Command command;

    public void setCommand(Command command) { // 생성자에서 Command 를 특정, 이 생성자에는 Receiver 를 특정해야 합니다.
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
