package OBSERVER_DSP_GOODCODE.Factory.impl;

import OBSERVER_DSP_GOODCODE.Factory.DataHandler;
import OBSERVER_DSP_GOODCODE.Factory.DataHandlerStrategyFactory;
import OBSERVER_DSP_GOODCODE.POJO.Data;


public class LocalDataHandler implements DataHandler {
    @Override
    public void handleData(Data data) {
        System.out.println("Data is handled locally");
        DataHandlerStrategyFactory.getDataHandlerStrategy(data).handleData(data);
    }

}
