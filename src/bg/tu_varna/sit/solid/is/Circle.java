package bg.tu_varna.sit.solid.is;

public record Circle(double radius) implements Area, Volume, Shape {

    public double area() {
        return 4 * Math.PI * Math.pow(this.radius(), 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(this.radius, 3);
    }
}
