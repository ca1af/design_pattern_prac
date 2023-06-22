package com.example.design_pattern.observer_pattern.observer;

import com.example.design_pattern.observer_pattern.subject.Subject;
import com.example.design_pattern.observer_pattern.subject.WeatherData;

public class CurrentWeather implements Observer {

    private Float temperature; // 기온
    private Float pressure; // 기압

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData){
            this.temperature = ((WeatherData) subject).getTemperature();
            this.pressure = ((WeatherData) subject).getPressure();
            display(temperature, pressure);
        }
    }

    public void display(Float temperature, Float pressure){
        System.out.println("기온은 (" + temperature + "), 기압은 (" + pressure + ") 입니다.");
    }
}
