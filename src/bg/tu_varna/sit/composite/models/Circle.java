package bg.tu_varna.sit.composite.models;

import bg.tu_varna.sit.composite.contracts.Shape;

public class Circle implements Shape {

    @Override
    public String draw(String fillColor) {
        return "Drawing Circle with color " + fillColor;
    }
}
