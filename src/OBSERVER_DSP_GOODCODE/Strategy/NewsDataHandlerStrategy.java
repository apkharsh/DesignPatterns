package OBSERVER_DSP_GOODCODE.Strategy;

import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.POJO.NewsData;

public class NewsDataHandlerStrategy implements DataHandlerStrategy {

    @Override
    public void handleData(Data data) {
        NewsData newsData = (NewsData) data;
        System.out.println("NewsDataHandleStrategy: " + newsData.getNews());
    }
}
