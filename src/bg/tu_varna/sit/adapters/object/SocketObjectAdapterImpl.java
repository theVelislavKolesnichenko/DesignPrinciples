package bg.tu_varna.sit.adapters.object;

import bg.tu_varna.sit.adapters.contracts.SocketAdapter;
import bg.tu_varna.sit.adapters.models.Socket;
import bg.tu_varna.sit.adapters.models.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //Using Composition for adapter pattern
    private Socket sock;

    public SocketObjectAdapterImpl(Socket sock) {
        this.sock = sock;
    }

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
