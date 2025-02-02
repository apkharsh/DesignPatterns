package OBSERVER_DSP_GOODCODE.Observable.impl;

import OBSERVER_DSP_GOODCODE.Observable.Observable;
import OBSERVER_DSP_GOODCODE.Observer.Observer;
import OBSERVER_DSP_GOODCODE.POJO.WeatherData;

import java.util.ArrayList;
import java.util.List;


public class WeatherStationObservable implements Observable {
    private WeatherData weatherData;
    private final List<Observer> observers = new ArrayList<>(); // List of observers. Maybe this we can get from DB in actual implementation

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(weatherData);
        }
    }
}
