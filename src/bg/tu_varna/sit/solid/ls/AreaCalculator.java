package bg.tu_varna.sit.solid.ls;

import java.util.List;

public class AreaCalculator extends Calculator {

    public AreaCalculator(List<Shape> shapes) {
        super(shapes);
    }

    public double sum() {
        double sum = 0;
        for (Shape shape : super.getShapes()) {
            sum += shape.area();
        }
        return sum;
    }
}
