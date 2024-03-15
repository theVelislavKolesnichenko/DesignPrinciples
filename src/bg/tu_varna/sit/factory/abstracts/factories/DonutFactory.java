package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Filling;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.models.Donut;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;

public class DonutFactory implements SweetAbstractFactory {
    private Donut donut;

    public DonutFactory() {
        donut = new Donut(Dough.DONUT, Glaze.GLAZE_1, Filling.FILLING_1);
    }

    @Override
    public Sweet createSweet() {
        return donut;
    }
}
