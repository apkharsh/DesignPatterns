package OBSERVER_DSP_GOODCODE.Strategy;

import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.POJO.WeatherData;

public class WeatherDataHandlerStrategy implements DataHandlerStrategy {
    @Override
    public void handleData(Data data) {
        WeatherData weatherData = (WeatherData) data;
        System.out.println("WeatherDataHandleStrategy: " + "Humidity " + weatherData.getHumidity() +
                " Pressure " + weatherData.getPressure() + " Temperature " + weatherData.getTemperature());
    }
}
