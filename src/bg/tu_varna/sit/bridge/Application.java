package bg.tu_varna.sit.bridge;

import bg.tu_varna.sit.bridge.contrcts.Device;
import bg.tu_varna.sit.bridge.models.AdvancedRemote;
import bg.tu_varna.sit.bridge.models.BasicRemote;
import bg.tu_varna.sit.bridge.models.Radio;
import bg.tu_varna.sit.bridge.models.Television;

public class Application {
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }
    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        System.out.println(device.getStatus());

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        System.out.println(device.getStatus());
    }
}
