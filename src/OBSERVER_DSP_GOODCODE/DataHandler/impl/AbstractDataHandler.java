package OBSERVER_DSP_GOODCODE.DataHandler.impl;

import OBSERVER_DSP_GOODCODE.DataHandler.DataHandler;
import OBSERVER_DSP_GOODCODE.Factory.DataHandlerStrategyFactory;
import OBSERVER_DSP_GOODCODE.POJO.Data;

import java.util.Objects;

public abstract class AbstractDataHandler implements DataHandler {
    @Override
    public void handleData(Data data) {

        prehandleData(data);
        Objects.requireNonNull(DataHandlerStrategyFactory.getDataHandlerStrategy(data)).handleData(data);
    }

    public abstract void prehandleData(Data data);
}
