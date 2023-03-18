package bg.tu_varna.sit.builder.v2.models;

public class ComputerBuilder {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String hdd, String ram){
        this.HDD=hdd;
        this.RAM=ram;
    }

    protected String getHDD() {
        return HDD;
    }

    protected String getRAM() {
        return RAM;
    }

    protected boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    protected boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build(){
        return new Computer(this);
    }
}
