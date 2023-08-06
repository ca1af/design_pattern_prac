package com.example.design_pattern.facade_pattern;

import com.example.design_pattern.facade_pattern.theater.*;

public class TheaterTest {
    public static void main(String[] args) {
        Popper popper = new Popper(); // 팝콘기계
        Projector projector = new Projector();
        Movie movie = new Movie("아저씨");
        Screen screen = new Screen();
        Lights lights = new Lights();

        System.out.println("========영화 한편 볼까?========");

        popper.on();
        popper.pop();
        lights.dim(10);
        projector.on();
        screen.down();
        screen.movieOn(movie);
    }
}
