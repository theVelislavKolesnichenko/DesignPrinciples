package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Cream;
import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.models.Eclair;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;

public class EclairFactory implements SweetAbstractFactory {
    private Eclair eclair;

    public EclairFactory(Dough dough, Cream cream, Glaze glaze) {
        eclair = new Eclair(dough, cream, glaze);
    }

    @Override
    public Sweet createSweet() {
        return eclair;
    }
}
