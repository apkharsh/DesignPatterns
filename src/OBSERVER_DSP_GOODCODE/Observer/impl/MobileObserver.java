package OBSERVER_DSP_GOODCODE.Observer.impl;

import OBSERVER_DSP_GOODCODE.Factory.DataHandlerFactory;
import OBSERVER_DSP_GOODCODE.POJO.Data;
import OBSERVER_DSP_GOODCODE.Observer.Observer;

public class MobileObserver implements Observer {
    String environment;

    public MobileObserver(String environment) {
        this.environment = environment;
    }

    @Override
    public void update(Data data) {
        DataHandlerFactory.getDataHandler(environment).handleData(data);

    }
}
