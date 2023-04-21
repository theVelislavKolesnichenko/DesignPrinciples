package bg.tu_varna.sit.composite;

import bg.tu_varna.sit.composite.contracts.Shape;
import bg.tu_varna.sit.composite.models.Circle;
import bg.tu_varna.sit.composite.models.Drawing;
import bg.tu_varna.sit.composite.models.Triangle;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing(new ArrayList<>());
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");
    }
}
