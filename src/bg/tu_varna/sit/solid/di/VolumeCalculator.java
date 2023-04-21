package bg.tu_varna.sit.solid.di;

import bg.tu_varna.sit.solid.di.interfaces.Shape;

import java.util.List;

public class VolumeCalculator extends AreaCalculator {

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
