package com.example.design_pattern.command_pattern.command;

import com.example.design_pattern.command_pattern.receiver.Stereo;

public class StereoOffCommand implements Command{
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void stereoOff(){
        System.out.println("스테레오를 끕니다.");
    }
    @Override
    public void execute() {
        stereoOff();
    }

    @Override
    public void undo() {
    }
}
