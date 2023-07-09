package com.example.design_pattern.command_pattern.invoker;

import com.example.design_pattern.command_pattern.command.Command;
import com.example.design_pattern.command_pattern.command.NoCommand;

public class Invoker {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public Invoker() {
        onCommands = new Command[7]; // 버튼은 7개라고 가정합니다
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            // 생성자이므로, 커맨드는 noCommand 로 초기화 합니다. (할당되지 않은 커맨드)
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand; // noCommand 로 초기화 해줍니다.
    }

    public Invoker(Command[] onCommands, Command[] offCommands) {
        this.onCommands = onCommands;
        this.offCommands = offCommands;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand; // 해당 슬롯에
        offCommands[slot] = offCommand; // 온커맨드, 오프커맨드를 할당합니다.
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot]; // undoCommand 에 마지막으로 누른 녀석을 할당합니다.
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot]; // undoCommand 에 마지막으로 누른 녀석을 할당합니다.
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
