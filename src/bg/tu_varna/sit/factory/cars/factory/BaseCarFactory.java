package bg.tu_varna.sit.factory.cars.factory;

import bg.tu_varna.sit.factory.cars.enums.Color;

public class BaseCarFactory {
    public static CarAbstractFactory getCarFactory(Color color) {
        CarAbstractFactory factory = new RedCarFactory();
        switch (color) {
            case GREEN -> factory = new GreenCarFactory();
            case BLUE -> factory = new BlueCarFactory();
        }
        return factory;
    }
}
