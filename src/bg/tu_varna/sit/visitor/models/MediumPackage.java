package bg.tu_varna.sit.visitor.models;

import bg.tu_varna.sit.visitor.contracts.Visitable;
import bg.tu_varna.sit.visitor.contracts.Visitor;

public class MediumPackage implements Visitable {

    private String size;
    private double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public MediumPackage(String size, double price) {
        this.size = size;
        this.price = price;
    }
}
