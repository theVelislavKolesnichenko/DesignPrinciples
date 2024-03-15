package bg.tu_varna.sit.factory.cars.factory;

import bg.tu_varna.sit.factory.cars.enums.Color;
import bg.tu_varna.sit.factory.cars.models.Car;

public class CarFactory  {
    public Car createCar(Color color) {
        CarAbstractFactory redCarFactory = BaseCarFactory.getCarFactory(color);
        return redCarFactory.create();
    }
}
