package bg.tu_varna.sit.factory.method.factories;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;
import bg.tu_varna.sit.factory.method.models.Cake;
import bg.tu_varna.sit.factory.method.models.Sweet;

public class CakeCream4Factory {
    public Sweet create() {
        return new Cake(Dough.CAKE, Cream.CREAM_4, 2);
    }
}
