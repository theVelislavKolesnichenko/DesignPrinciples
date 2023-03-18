package bg.tu_varna.sit.is;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Square(5));
        shapes.add(new Square(6));

        AreaCalculator areaCalculator = new AreaCalculator(shapes);
        SumCalculatorPrinter areaPrinter = new SumCalculatorPrinter(areaCalculator);
        System.out.println(areaPrinter.print());
        System.out.println(areaPrinter.json());
        System.out.println(areaPrinter.xml());

        VolumeCalculator volumeCalculator = new VolumeCalculator(shapes);
        SumCalculatorPrinter volumePrinter = new SumCalculatorPrinter(volumeCalculator);
        System.out.println(volumePrinter.print());
        System.out.println(volumePrinter.json());
        System.out.println(volumePrinter.xml());
    }
}
