package OBSERVER_DSP_GOODCODE.Observable;


import OBSERVER_DSP_GOODCODE.Observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
