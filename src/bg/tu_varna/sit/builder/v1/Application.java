package bg.tu_varna.sit.builder.v1;

public class Application {
    public static void main(String[] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder("500 GB", "2 GB");
        builder.setBluetoothEnabled(true);
        builder.setGraphicsCardEnabled(true);
        Computer comp = builder.build();

        Computer com1 = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .build();
    }
}
