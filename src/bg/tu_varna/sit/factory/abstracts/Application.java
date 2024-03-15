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
        Sweet cake = SweetFactory.getFactory(Dough.CAKE).createSweet();

        Sweet eclair = SweetFactory.getFactory(Dough.ECLAIR).createSweet();

        System.out.println(cake.baking());
    }
}
