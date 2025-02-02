package OBSERVER_DSP_GOODCODE.Factory;

import OBSERVER_DSP_GOODCODE.Factory.impl.LocalDataHandler;
import OBSERVER_DSP_GOODCODE.Factory.impl.ProductionDataHandler;

public class DataHandlerFactory {

    public static DataHandler getDataHandler(String type) {
        if (type.equals("Prod")) {
            return new ProductionDataHandler();
        } else if (type.equals("Local")) {
            return new LocalDataHandler();
        } else {
            return null;
        }
    }
}
