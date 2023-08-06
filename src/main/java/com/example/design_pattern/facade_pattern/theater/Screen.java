package com.example.design_pattern.facade_pattern.theater;

public class Screen {
    public void down(){
        System.out.println("스크린 내려갑니다");
    }

    public void movieOn(Movie movie){
        System.out.println("영화 이름 : " + movie.getName() + ", 상영 시작합니다");
    }
}
