package bg.tu_varna.sit.factory.abstracts.models;

import bg.tu_varna.sit.factory.abstracts.enums.Dough;
import bg.tu_varna.sit.factory.abstracts.enums.Filling;
import bg.tu_varna.sit.factory.abstracts.enums.Glaze;

public class Donut extends Sweet {
    private Glaze glaze;
    private Filling filling;

    public Donut(Dough dough, Glaze glaze, Filling filling) {
        super(dough);
        this.glaze = glaze;
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() +
                " glaze=" + glaze +
                ", filling=" + filling +
                '}';
    }
}
