package bg.tu_varna.sit.composite.models;

import bg.tu_varna.sit.composite.contracts.Shape;

import java.util.List;

public class Drawing implements Shape {

    private List<Shape> shapes;

    public Drawing(List<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String draw(String fillColor) {
        StringBuilder builder = new StringBuilder();
        for(Shape sh : shapes)
        {
            builder.append(sh.draw(fillColor));
        }
        return builder.toString();
    }


    public void add(Shape s){
        this.shapes.add(s);
    }


    public void remove(Shape s){
        shapes.remove(s);
    }


    public void clear(){
       this.shapes.clear();
    }
}
