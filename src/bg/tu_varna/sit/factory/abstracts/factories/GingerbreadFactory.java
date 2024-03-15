package bg.tu_varna.sit.factory.abstracts.factories;

import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;
import bg.tu_varna.sit.factory.abstracts.models.Gingerbread;
import bg.tu_varna.sit.factory.abstracts.models.Sweet;

public class GingerbreadFactory implements SweetAbstractFactory {
    private Gingerbread gingerbread;

    public GingerbreadFactory() {
        gingerbread = new Gingerbread(Dough.GINGERBREAD, Glaze.GLAZE_1);
    }

    @Override
    public Sweet createSweet() {
        return gingerbread;
    }
}
