package bg.tu_varna.sit.builder.v2.models;

public class Computer {

    private final String HDD;
    private final String RAM;
    private final boolean isGraphicsCardEnabled;
    private final boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    protected Computer(ComputerBuilder builder) {
        this.HDD = builder.getHDD();
        this.RAM = builder.getRAM();
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
        this.isBluetoothEnabled = builder.isBluetoothEnabled();
    }
}
