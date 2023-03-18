package bg.tu_varna.sit.sr;

import java.util.ArrayList;
import java.util.List;

public class SRApplication {
    public static void main(String[] args) {
        List<Object> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Square(5));
        shapes.add(new Square(6));

        AreaCalculator areas = new AreaCalculator(shapes);

        //System.out.println(areas.print());
    }
}
