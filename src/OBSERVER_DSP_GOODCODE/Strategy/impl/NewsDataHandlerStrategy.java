package OBSERVER_DSP_GOODCODE.Strategy.impl;

import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.POJO.NewsData;
import OBSERVER_DSP_GOODCODE.Strategy.DataHandlerStrategy;

public class NewsDataHandlerStrategy implements DataHandlerStrategy {

    @Override
    public void handleData(Data data) {
        NewsData newsData = (NewsData) data;
        System.out.println("NewsDataHandleStrategy: " + newsData.getNews());
    }
}
