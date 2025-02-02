package OBSERVER_DSP_GOODCODE.Observer.impl;


import OBSERVER_DSP_GOODCODE.Factory.DataHandlerFactory;
import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.Observer.Observer;

import java.util.Objects;

public class TvObserver implements Observer {
    String environment;

    public TvObserver(String environment) {
        this.environment = environment;
    }

    @Override
    public void update(Data data) {
        DataHandlerFactory.getDataHandler(environment).handleData(data);
    }
}
