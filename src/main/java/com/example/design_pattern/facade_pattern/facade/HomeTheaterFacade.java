package com.example.design_pattern.facade_pattern.facade;

import com.example.design_pattern.facade_pattern.theater.*;

public class HomeTheaterFacade {
    Lights lights;
    Popper popper;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(Lights lights, Popper popper, Projector projector, Screen screen) {
        this.lights = lights;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
    }

    public void watchMovie(Movie movie){
        System.out.println("홈씨어터 영화보기 시퀀스 시작!");
        popper.on();
        popper.pop();
        lights.dim(10);
        projector.on();
        screen.down();
        screen.movieOn(movie);
    }

    public void endMovie(){
        System.out.println("홈시어터 끄는 중");
        popper.off();
        // ...
        // 전부 .off() 매서드로 꺼버리기
    }
}
