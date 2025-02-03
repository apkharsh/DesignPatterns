package OBSERVER_DSP_GOODCODE.DataHandler.impl;

import OBSERVER_DSP_GOODCODE.POJO.Data;

public class ProductionDataHandler extends AbstractDataHandler {

    @Override
    public void prehandleData(Data data) {
        System.out.println("Data is handled in production");
    }
}
