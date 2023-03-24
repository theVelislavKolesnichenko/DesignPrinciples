package bg.tu_varna.sit.factory.abstracts;

import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.factories.CakeFactory;
import bg.tu_varna.sit.factory.abstracts.factories.EclairFactory;
import bg.tu_varna.sit.factory.abstracts.factories.SweetFactory;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;
import bg.tu_varna.sit.factory.abstracts.enums.Cream;
import bg.tu_varna.sit.factory.abstracts.enums.Dough;

public class Application {
    public static void main(String[] args) {
        Sweet cake = SweetFactory.getSweet(
                new CakeFactory(Dough.CAKE,
                        Cream.CREAM_1,
                        2)
        );

        Sweet eclair = SweetFactory.getSweet(
                new EclairFactory(Dough.ECLAIR,
                        Cream.CREAM_1,
                        Glaze.GLAZE_1)
        );

        System.out.println(cake.baking());
    }
}
