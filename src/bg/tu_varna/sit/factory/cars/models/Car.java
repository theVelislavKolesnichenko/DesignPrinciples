package bg.tu_varna.sit.factory.cars.models;

import bg.tu_varna.sit.factory.cars.enums.Color;

public class Car {
    public Color color;

    public Car(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
