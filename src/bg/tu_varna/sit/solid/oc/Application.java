package bg.tu_varna.sit.oc;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Square(5));
        shapes.add(new Square(6));

        AreaCalculator areas = new AreaCalculator(shapes);
        SumCalculatorPrinter printer = new SumCalculatorPrinter(areas);

        System.out.println(printer.print());
        System.out.println(printer.json());
        System.out.println(printer.xml());
    }
}
