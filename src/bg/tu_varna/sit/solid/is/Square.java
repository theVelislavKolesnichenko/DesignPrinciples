package bg.tu_varna.sit.is;

public record Square(double length) implements Area, Volume, Shape {

    public double area() {
        return Math.pow(this.length(), 2);
    }

    @Override
    public double volume() {
        return Math.pow(this.length, 3);
    }
}
