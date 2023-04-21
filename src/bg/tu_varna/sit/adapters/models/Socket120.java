package bg.tu_varna.sit.adapters.models;

import bg.tu_varna.sit.adapters.contracts.Socket;

public class Socket120 implements Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
