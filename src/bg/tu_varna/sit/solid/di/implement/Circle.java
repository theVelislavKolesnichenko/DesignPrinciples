package bg.tu_varna.sit.di.implement;

import bg.tu_varna.sit.di.interfaces.Shape;
import bg.tu_varna.sit.is.Area;
import bg.tu_varna.sit.is.Volume;

public class Circle implements Area, Volume, Shape {
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
        return 2*Math.PI*this.radius;
    }
}
