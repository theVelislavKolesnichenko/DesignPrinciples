package bg.tu_varna.sit.adapters.contracts;

import bg.tu_varna.sit.adapters.models.Volt;

public interface SocketAdapter {
    Volt get120Volt();

    Volt get12Volt();

    Volt get3Volt();
}
