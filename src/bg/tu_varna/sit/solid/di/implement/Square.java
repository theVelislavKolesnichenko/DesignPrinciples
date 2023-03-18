package bg.tu_varna.sit.di.implement;

import bg.tu_varna.sit.di.interfaces.Area;
import bg.tu_varna.sit.di.interfaces.Shape;
import bg.tu_varna.sit.di.interfaces.Volume;

public class Square implements Area, Volume, Shape {
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

    @Override
    public double volume() {
        return 4*this.length;
    }
}
