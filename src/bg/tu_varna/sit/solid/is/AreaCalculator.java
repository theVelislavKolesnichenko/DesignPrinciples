package bg.tu_varna.sit.is;

import java.util.List;

public class AreaCalculator {
    private List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    protected List<Shape> getShapes() {
        return shapes;
    }

    public double sum() {
        double sum = 0;
        for (Shape shape : shapes) {
                sum += value(shape);
        }
        return sum;
    }

    public double value(Shape shape) {
        return shape.area();
    }
}
