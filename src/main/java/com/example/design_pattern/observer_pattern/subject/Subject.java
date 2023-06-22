package com.example.design_pattern.observer_pattern.subject;

import com.example.design_pattern.observer_pattern.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
