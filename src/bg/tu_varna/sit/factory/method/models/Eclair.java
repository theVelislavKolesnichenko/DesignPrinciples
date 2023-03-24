package bg.tu_varna.sit.factory.method.models;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;
import bg.tu_varna.sit.factory.method.enums.Filling;
import bg.tu_varna.sit.factory.method.enums.Glaze;

public class Eclair extends Sweet {
    private Cream cream;
    private Glaze glaze;

    public Eclair(Dough dough, Cream cream, Glaze glaze) {
        super(dough);
        this.cream = cream;
        this.glaze = glaze;
    }

    @Override
    public String toString() {
        return super.toString() +
                " cream=" + cream +
                ", glaze=" + glaze +
                '}';
    }
}
