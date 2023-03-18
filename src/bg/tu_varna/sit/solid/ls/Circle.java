package bg.tu_varna.sit.ls;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public double volume() {
        return (4/3)*Math.PI*Math.pow(this.radius, 3);
    }
}
