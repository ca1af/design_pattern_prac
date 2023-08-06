package com.example.design_pattern.facade_pattern;

import com.example.design_pattern.facade_pattern.facade.HomeTheaterFacade;
import com.example.design_pattern.facade_pattern.theater.*;

public class FacadeTest {
    public static void main(String[] args) {
        Popper popper = new Popper(); // 팝콘기계
        Projector projector = new Projector();
        Movie movie = new Movie("아저씨");
        Screen screen = new Screen();
        Lights lights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(lights, popper, projector, screen);

        homeTheater.watchMovie(movie);
        homeTheater.endMovie();
    }
}
