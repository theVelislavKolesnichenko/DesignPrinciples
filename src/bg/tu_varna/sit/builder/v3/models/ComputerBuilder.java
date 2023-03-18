package bg.tu_varna.sit.builder.v3.models;

public class ComputerBuilder {

    private Computer computer;

    public ComputerBuilder(String hdd, String ram){
        this.computer = new Computer(hdd, ram);
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.computer.setGraphicsCardEnabled(isGraphicsCardEnabled);
        return this;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.computer.setBluetoothEnabled(isBluetoothEnabled);
        return this;
    }

    public Computer build(){
        return computer;
    }
}
