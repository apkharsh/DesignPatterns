package OBSERVER_DSP_GOODCODE.DataHandler.impl;

import OBSERVER_DSP_GOODCODE.DataHandler.DataHandler;
import OBSERVER_DSP_GOODCODE.Factory.DataHandlerStrategyFactory;
import OBSERVER_DSP_GOODCODE.POJO.Data;

import java.util.Objects;

public class ProductionDataHandler implements DataHandler {
    @Override
    public void handleData(Data data) {
        System.out.println("Production Data Handler");
        Objects.requireNonNull(DataHandlerStrategyFactory.getDataHandlerStrategy(data)).handleData(data);
    }
}
