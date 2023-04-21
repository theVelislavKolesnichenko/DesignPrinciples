package bg.tu_varna.sit.solid.di.implement;

import bg.tu_varna.sit.solid.di.interfaces.Area;
import bg.tu_varna.sit.solid.di.interfaces.Volume;
import bg.tu_varna.sit.solid.di.interfaces.Shape;

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
