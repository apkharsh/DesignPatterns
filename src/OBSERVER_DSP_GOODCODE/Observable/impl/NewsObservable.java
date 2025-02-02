package OBSERVER_DSP_GOODCODE.Observable.impl;

import OBSERVER_DSP_GOODCODE.Observable.Observable;
import OBSERVER_DSP_GOODCODE.POJO.NewsData;
import OBSERVER_DSP_GOODCODE.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsObservable implements Observable {

    List<Observer> observers = new ArrayList<>();
    NewsData newsData;

    public void setNewsData(NewsData newsData) {
        this.newsData = newsData;
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
            observer.update(newsData);
        }
    }
}
