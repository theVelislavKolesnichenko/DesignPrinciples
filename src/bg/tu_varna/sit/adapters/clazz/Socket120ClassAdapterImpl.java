package bg.tu_varna.sit.adapters.clazz;

import bg.tu_varna.sit.adapters.contracts.SocketAdapter;
import bg.tu_varna.sit.adapters.models.Socket120;
import bg.tu_varna.sit.adapters.models.Volt;

public class Socket120ClassAdapterImpl extends Socket120 implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }

}
