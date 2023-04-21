package bg.tu_varna.sit.adapters.models;

import bg.tu_varna.sit.adapters.contracts.Socket;

public class Socket240 implements Socket {
    @Override
    public Volt getVolt() {
        return new Volt(240);
    }
}
