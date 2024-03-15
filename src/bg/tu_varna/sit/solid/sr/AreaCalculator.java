package bg.tu_varna.sit.solid.sr;

import bg.tu_varna.sit.solid.di.implement.Circle;
import bg.tu_varna.sit.solid.di.implement.Square;

import java.util.List;

public class AreaCalculator {
    private List<Object> shapes;

    public AreaCalculator(List<Object> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        double sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Square square) {
                sum += Math.pow(square.getLength(), 2);
            } else if (shape instanceof Circle circle) {
                sum += Math.PI * Math.pow(circle.getRadius(), 2);
            }
        }
        return sum;
    }

//    public void print() {
//        System.out.printf("Сумата от площа на фигурите е: %s", this.sum());
//    }
}
