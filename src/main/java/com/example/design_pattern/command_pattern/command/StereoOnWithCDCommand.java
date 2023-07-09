package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Stereo;

public class StereoOnWithCDCommand implements Command{
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11); // 여기서는 그냥 맞춰줬습니다.
    }

    @Override
    public void undo() {

    }
}
