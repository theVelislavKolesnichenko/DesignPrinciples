package bg.tu_varna.sit.composite.models;

import bg.tu_varna.sit.composite.contracts.Shape;

public class Triangle implements Shape {

    @Override
    public String draw(String fillColor) {
        return "Drawing Triangle with color " + fillColor;
    }
}
