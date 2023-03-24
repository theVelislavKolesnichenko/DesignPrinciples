package bg.tu_varna.sit.factory.method.models;

import bg.tu_varna.sit.factory.method.contracts.Bakery;
import bg.tu_varna.sit.factory.method.enums.Dough;

public abstract class Sweet implements Bakery {
    private Dough dough;

    public Sweet(Dough dough) {
        this.dough = dough;
    }

    @Override
    public String baking() {
        return "Изпичане: " + this;
    }

    @Override
    public String toString() {
        return "{" +
                "dough=" + dough;
    }
}
