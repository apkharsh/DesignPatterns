package OBSERVER_DSP_GOODCODE;

import OBSERVER_DSP_GOODCODE.Observable.impl.NewsObservable;
import OBSERVER_DSP_GOODCODE.Observable.impl.WeatherStationObservable;
import OBSERVER_DSP_GOODCODE.Observer.impl.MobileObserver;
import OBSERVER_DSP_GOODCODE.Observer.impl.TvObserver;
import OBSERVER_DSP_GOODCODE.POJO.NewsData;
import OBSERVER_DSP_GOODCODE.POJO.WeatherData;

public class Operator {
    public static void main(String[] args) {

        // someone came who had the weather data and they will not send this data to the weather station
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(80, 65, 30.4f);

        WeatherStationObservable weatherStationObservable = new WeatherStationObservable();
        String localEnv = "Local";
        String prodEnv = "Prod";
        TvObserver tvObserver = new TvObserver(localEnv);
        MobileObserver mobileObserver = new MobileObserver(prodEnv);
        // Add the observers
        weatherStationObservable.addObserver(tvObserver);
        weatherStationObservable.addObserver(mobileObserver);
        weatherStationObservable.setWeatherData(weatherData);

        // Let's create some news data
        NewsData newsData = new NewsData();
        newsData.setNews("Ye to latest news hai");
        // Add the observers
        NewsObservable newsObservable = new NewsObservable();
        newsObservable.addObserver(tvObserver);
        newsObservable.addObserver(mobileObserver);
        newsObservable.setNewsData(newsData);
    }
}
