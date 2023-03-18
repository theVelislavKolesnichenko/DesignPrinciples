package bg.tu_varna.sit.is;

public record Circle(double radius) implements Area, Volume, Shape {

    public double area() {
        return Math.PI * Math.pow(this.radius(), 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(this.radius, 3);
    }
}
