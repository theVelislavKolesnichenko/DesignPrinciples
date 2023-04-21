package bg.tu_varna.sit.solid.oc;

public class Square implements Shape {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return Math.pow(this.getLength(), 2);
    }
}
