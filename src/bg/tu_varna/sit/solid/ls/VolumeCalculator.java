package bg.tu_varna.sit.ls;

import java.util.List;

public class VolumeCalculator extends Calculator {

    public VolumeCalculator(List<Shape> shapes) {
        super(shapes);
    }

    @Override
    public double sum() {
        double sum = 0;
        for (Shape shape : super.getShapes()) {
            sum = shape.volume();
        }
        return sum;
    }
}
