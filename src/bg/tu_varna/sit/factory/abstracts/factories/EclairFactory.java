package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Cream;
import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.models.Eclair;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;

public class EclairFactory implements SweetAbstractFactory {
    private Eclair eclair;

    public EclairFactory() {
        eclair = new Eclair(Dough.ECLAIR, Cream.CREAM_1, Glaze.GLAZE_1);
    }

    @Override
    public Sweet createSweet() {
        return eclair;
    }
}
