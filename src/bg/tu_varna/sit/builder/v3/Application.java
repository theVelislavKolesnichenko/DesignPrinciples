package bg.tu_varna.sit.builder.v3;

import bg.tu_varna.sit.builder.v3.models.Computer;
import bg.tu_varna.sit.builder.v3.models.ComputerBuilder;

public class Application {

    public static void main(String[] args) {
        ComputerBuilder builder =
                new ComputerBuilder("500 GB", "2 GB");


        Computer comp = builder.build();
    }

}
