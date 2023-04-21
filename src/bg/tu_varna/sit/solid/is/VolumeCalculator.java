package bg.tu_varna.sit.solid.is;

import java.util.List;

public class VolumeCalculator extends AreaCalculator {

    public VolumeCalculator(List<Shape> shapes) {
        super(shapes);
    }

    @Override
    public double value(Shape shape) {
        return shape.volume();
    }
}
