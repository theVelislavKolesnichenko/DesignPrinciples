package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Cream;
import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Filling;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.models.*;

public class SweetFactory {
    public static SweetAbstractFactory getFactory(Dough dough){
        SweetAbstractFactory sweetFactory = new CakeFactory();

        switch (dough) {
            case CAKE -> sweetFactory = new CakeFactory();
            case DONUT -> sweetFactory = new DonutFactory();
            case ECLAIR -> sweetFactory = new EclairFactory();
            case GINGERBREAD -> sweetFactory = new GingerbreadFactory();
        }

        return sweetFactory;
    }
}
