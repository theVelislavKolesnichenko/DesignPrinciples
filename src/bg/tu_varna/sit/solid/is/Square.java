package bg.tu_varna.sit.solid.is;

public record Square(double length) implements Area, Volume, Shape {

    public double area() {
        return 6 * Math.pow(this.length(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(this.length, 3);
    }
}
