package bg.tu_varna.sit.sr;

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

    /*public String print() {
        return String.format("Сумата от площа на фигурите е: %s", this.sum());
    }*/
}
