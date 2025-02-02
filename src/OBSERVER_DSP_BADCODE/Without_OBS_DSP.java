package OBSERVER_DSP_BADCODE;
import java.util.ArrayList;
import java.util.List;

public class Without_OBS_DSP {
}



// Subject class
class WeatherData {
    public List<Object> observers = new ArrayList<>();
    public float temperature;

    public void registerObserver(Object o) {
        observers.add(o);
    }

    public void removeObserver(Object o) {
        observers.remove(o);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Object o : observers) {
            // We assume all observers are of type Display, but we don't check
            ((Display) o).update(temperature);
        }
    }
}

// Observer interface (supposed to be)
interface Display {
    void update(float temp);
}

// Concrete Observer
class CurrentConditionsDisplay implements Display {
    public float currentTemperature;

    public void update(float temp) {
        currentTemperature = temp;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + currentTemperature);
    }
}

// Another concrete observer with similar implementation
class StatisticsDisplay implements Display {
    public float maxTemp = Float.MIN_VALUE;
    public float minTemp = Float.MAX_VALUE;
    public float sumTemp;
    public int numReadings;

    public void update(float temp) {
        sumTemp += temp;
        numReadings++;
        if (temp > maxTemp) maxTemp = temp;
        if (temp < minTemp) minTemp = temp;
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature: " + (sumTemp/numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}

