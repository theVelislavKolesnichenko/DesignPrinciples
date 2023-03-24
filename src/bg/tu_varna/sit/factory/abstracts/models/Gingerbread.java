package bg.tu_varna.sit.factory.abstracts.models;

import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;

public class Gingerbread extends Sweet {
    private Glaze glaze;

    public Gingerbread(Dough dough, Glaze glaze) {
        super(dough);
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return super.toString() +
                " glaze=" + glaze +
                '}';
    }
}
