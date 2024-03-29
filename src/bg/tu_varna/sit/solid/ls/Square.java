package bg.tu_varna.sit.solid.ls;

public class Square implements Shape {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return 6*Math.pow(this.getLength(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(this.length, 3);
    }
}
