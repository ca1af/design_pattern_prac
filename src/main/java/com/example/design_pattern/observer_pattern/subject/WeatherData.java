package com.example.design_pattern.observer_pattern.subject;

import com.example.design_pattern.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private Float temperature; // 기온
    private Float pressure; // 기압
    private List<Observer> observers;

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getPressure() {
        return pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
