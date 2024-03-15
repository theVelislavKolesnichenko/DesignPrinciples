package bg.tu_varna.sit.factory.method.factories;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;
import bg.tu_varna.sit.factory.method.models.Cake;

public class CakeCream2Factory {
    public Cake create() {
        return new Cake(Dough.CAKE, Cream.CREAM_2, 2);
    }
}
