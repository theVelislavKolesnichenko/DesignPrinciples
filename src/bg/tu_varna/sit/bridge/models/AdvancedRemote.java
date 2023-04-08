package bg.tu_varna.sit.bridge.models;

import bg.tu_varna.sit.bridge.contrcts.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
        super.device = device;
    }

    public void mute() {
        device.setVolume(0);
    }
}
