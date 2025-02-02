package OBSERVER_DSP_GOODCODE.Factory;

import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.POJO.NewsData;
import OBSERVER_DSP_GOODCODE.POJO.WeatherData;
import OBSERVER_DSP_GOODCODE.Strategy.DataHandlerStrategy;
import OBSERVER_DSP_GOODCODE.Strategy.NewsDataHandlerStrategy;
import OBSERVER_DSP_GOODCODE.Strategy.WeatherDataHandlerStrategy;

public class DataHandlerStrategyFactory {

    public static DataHandlerStrategy getDataHandlerStrategy(Data data) {
        if(data instanceof NewsData) {
            return new NewsDataHandlerStrategy();
        }
        else if(data instanceof WeatherData) {
            return new WeatherDataHandlerStrategy();
        }
        return null;
    }
}
