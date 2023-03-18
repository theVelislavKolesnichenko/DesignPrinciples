package bg.tu_varna.sit.builder.v2;

import bg.tu_varna.sit.builder.v2.models.Computer;
import bg.tu_varna.sit.builder.v2.models.ComputerBuilder;

public class Application {

    public static void main(String[] args) {
        ComputerBuilder builder =
                new ComputerBuilder("500 GB", "2 GB");
        builder.setBluetoothEnabled(true);
        builder.setGraphicsCardEnabled(true);

        Computer comp = builder.build();
    }

}
