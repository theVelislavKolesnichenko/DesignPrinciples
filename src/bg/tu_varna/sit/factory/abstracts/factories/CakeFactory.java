package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Cream;
import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.models.Cake;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;

public class CakeFactory implements SweetAbstractFactory {

    private Cake cake;

    public CakeFactory(Dough dough, Cream cream, int layers) {
        this.cake = new Cake(dough, cream, layers);
    }

    @Override
    public Sweet createSweet() {
        return cake;
    }
}
