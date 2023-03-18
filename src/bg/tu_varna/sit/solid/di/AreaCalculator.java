package bg.tu_varna.sit.di;

import bg.tu_varna.sit.di.interfaces.Shape;

import java.util.List;

public class AreaCalculator {
    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    protected List<Shape> getShapes() {
        return shapes;
    }

    public double sum() {
        double sum = 0;
        for (Shape shape : shapes) {
                sum = shape.area();
        }
        return sum;
    }
}
