package bg.tu_varna.sit.builder.v3.models;

public class Computer {

    private String HDD;
    private String RAM;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

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

    protected void setHDD(String HDD) {
        this.HDD = HDD;
    }

    protected void setRAM(String RAM) {
        this.RAM = RAM;
    }

    protected void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }

    protected void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    protected Computer(String hdd, String ram) {
        this.setHDD(hdd);
        this.setRAM(ram);
    }

}
