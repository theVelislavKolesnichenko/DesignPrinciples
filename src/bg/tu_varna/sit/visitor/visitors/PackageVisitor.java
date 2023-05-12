package bg.tu_varna.sit.visitor.visitors;

import bg.tu_varna.sit.visitor.contracts.Visitor;
import bg.tu_varna.sit.visitor.models.LargePackage;
import bg.tu_varna.sit.visitor.models.MediumPackage;
import bg.tu_varna.sit.visitor.models.SmallPackage;

public class PackageVisitor implements Visitor {

    private double totalCost;
    @Override
    public void visit(SmallPackage smallPackage) {
        totalCost+=smallPackage.getPrice();
    }

    @Override
    public void visit(MediumPackage mediumPackage) {
        totalCost+=mediumPackage.getPrice();
    }

    @Override
    public void visit(LargePackage largePackage) {
        totalCost+=largePackage.getPrice();
    }

    public double getTotalCost() {
        return totalCost;
    }
}
