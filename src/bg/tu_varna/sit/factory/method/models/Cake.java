package bg.tu_varna.sit.factory.method.models;

import bg.tu_varna.sit.factory.method.enums.Cream;
import bg.tu_varna.sit.factory.method.enums.Dough;

public class Cake extends Sweet {
    private int layers;
    private Cream cream;

    public Cake(Dough dough, Cream cream, int layers) {
        super(dough);
        this.layers = layers;
        this.cream = cream;
    }

    @Override
    public String toString() {
        return super.toString() +
                " layers=" + layers +
                ", cream=" + cream +
                '}';
    }
}
