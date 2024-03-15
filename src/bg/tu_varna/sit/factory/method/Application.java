package bg.tu_varna.sit.factory.method;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.factories.CakeCream1Factory;
import bg.tu_varna.sit.factory.method.models.Cake;
import bg.tu_varna.sit.factory.method.models.Sweet;

public class Application {
    public static void main(String[] args) {

        CakeCream1Factory cakeFactory = new CakeCream1Factory();

        Cake cake = cakeFactory.create();
        System.out.println(cake.baking());

    }
}
