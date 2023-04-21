package bg.tu_varna.sit.adapters.clazz;

import bg.tu_varna.sit.adapters.contracts.SocketAdapter;
import bg.tu_varna.sit.adapters.models.Socket240;
import bg.tu_varna.sit.adapters.models.Volt;

public class Socket240ClassAdapterImpl extends Socket240 implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return convertVolt(getVolt(), 2);
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt(), 20);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt(), 60);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
