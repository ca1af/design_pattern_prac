package com.example.design_pattern.observer_pattern;

import com.example.design_pattern.observer_pattern.observer.CurrentWeather;
import com.example.design_pattern.observer_pattern.observer.Observer;
import com.example.design_pattern.observer_pattern.subject.Subject;
import com.example.design_pattern.observer_pattern.subject.WeatherData;

public class ObserverPatternTest {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        Observer currentWeather = new CurrentWeather();

        weatherData.registerObserver(currentWeather);

        weatherData.setPressure(10F);
        weatherData.setTemperature(10F);

        weatherData.notifyObserver(); // PUSH 방식 - Subject 에서 Observer 에게

        weatherData.setTemperature(20F);
        weatherData.setPressure(20F);

        currentWeather.update(weatherData); // PULL 방식 - Observer 스스로 필요 할 때!
    }
}
