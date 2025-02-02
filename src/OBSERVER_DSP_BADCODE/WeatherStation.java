package OBSERVER_DSP_BADCODE;

// Main to simulate weather station
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticsDisplay);

        weatherData.setTemperature(25.0f);
        weatherData.setTemperature(30.0f);
    }
}
