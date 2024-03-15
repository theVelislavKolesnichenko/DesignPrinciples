package bg.tu_varna.sit.factory.cars;

import bg.tu_varna.sit.factory.cars.enums.Color;
import bg.tu_varna.sit.factory.cars.factory.*;
import bg.tu_varna.sit.factory.cars.models.Car;

public class Application {
    public static void main(String[] args) {
//        CarAbstractFactory redCarFactory = new RedCarFactory();
//        Car redCar = redCarFactory.create();
//        System.out.println(redCar.getColor());
//
//        CarAbstractFactory greenCarFactory = new GreenCarFactory();
//        Car greenCar = greenCarFactory.create();
//        System.out.println(greenCar.getColor());
//
//        CarAbstractFactory blueCarFactory = new BlueCarFactory();
//        Car blueCar = blueCarFactory.create();
//        System.out.println(blueCar.getColor());
//
//
//        CarAbstractFactory redCarFactory = BaseCarFactory.getCarFactory(Color.RED);
//        Car redCar = redCarFactory.create();
//        System.out.println(redCar.getColor());
//
//        CarAbstractFactory greenCarFactory = BaseCarFactory.getCarFactory(Color.GREEN);
//        Car greenCar = greenCarFactory.create();
//        System.out.println(greenCar.getColor());
//
//        CarAbstractFactory blueCarFactory = BaseCarFactory.getCarFactory(Color.BLUE);
//        Car blueCar = blueCarFactory.create();
//        System.out.println(blueCar.getColor());

        System.out.println(new CarFactory().createCar(Color.RED).getColor());
        System.out.println(new CarFactory().createCar(Color.GREEN).getColor());
        System.out.println(new CarFactory().createCar(Color.BLUE).getColor());
    }
}
