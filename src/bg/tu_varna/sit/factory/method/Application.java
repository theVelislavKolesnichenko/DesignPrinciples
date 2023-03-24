package bg.tu_varna.sit.factory.method;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;
import bg.tu_varna.sit.factory.method.enums.Filling;
import bg.tu_varna.sit.factory.method.enums.Glaze;
import bg.tu_varna.sit.factory.method.factories.SweetFactory;
import bg.tu_varna.sit.factory.method.models.Sweet;

public class Application {
    public static void main(String[] args) {
        Sweet cake =
                SweetFactory.getSweet(Dough.CAKE,
                                Cream.CREAM_1,
                                Filling.NONE,
                                Glaze.NONE,
                                2);

        Sweet donut =
                SweetFactory.getSweet(Dough.DONUT,
                        Cream.NONE,
                        Filling.FILLING_2,
                        Glaze.GLAZE_1,
                        0);

        System.out.println(cake.baking());
    }
}
