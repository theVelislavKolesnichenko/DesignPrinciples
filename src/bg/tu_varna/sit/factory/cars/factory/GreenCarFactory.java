package bg.tu_varna.sit.factory.cars.factory;

import bg.tu_varna.sit.factory.cars.enums.Color;
import bg.tu_varna.sit.factory.cars.models.Car;

public class GreenCarFactory implements CarAbstractFactory {
    public Car create() {
        return new Car(Color.GREEN);
    }
}
