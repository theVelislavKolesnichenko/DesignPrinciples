package bg.tu_varna.sit.ls;

import java.util.List;

public abstract class Calculator {
    private List<Shape> shapes;

    public Calculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public abstract double sum();
}
