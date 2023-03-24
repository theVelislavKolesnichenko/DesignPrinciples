package bg.tu_varna.sit.factory.method.factories;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;
import bg.tu_varna.sit.factory.method.enums.Filling;
import bg.tu_varna.sit.factory.method.enums.Glaze;
import bg.tu_varna.sit.factory.method.models.*;

public class SweetFactory {
    public static Sweet getSweet(Dough dough, Cream cream, Filling filling, Glaze glaze, int layers){
        Sweet sweet = null;
        switch (dough) {
            case CAKE -> sweet = new Cake(dough, cream, layers);
            case DONUT -> sweet = new Donut(dough, glaze, filling);
            case ECLAIR -> sweet = new Eclair(dough, cream, glaze);
            case GINGERBREAD -> sweet = new Gingerbread(dough, glaze);
            default -> throw new IllegalArgumentException("dough");
        }
        return sweet;
    }
}
