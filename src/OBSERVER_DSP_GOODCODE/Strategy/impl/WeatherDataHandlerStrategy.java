package OBSERVER_DSP_GOODCODE.Strategy.impl;

import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.POJO.WeatherData;
import OBSERVER_DSP_GOODCODE.Strategy.DataHandlerStrategy;

public class WeatherDataHandlerStrategy implements DataHandlerStrategy {
    @Override
    public void handleData(Data data) {
        WeatherData weatherData = (WeatherData) data;
        System.out.println("WeatherDataHandleStrategy: " + "Humidity " + weatherData.getHumidity() +
                " Pressure " + weatherData.getPressure() + " Temperature " + weatherData.getTemperature());
    }
}
