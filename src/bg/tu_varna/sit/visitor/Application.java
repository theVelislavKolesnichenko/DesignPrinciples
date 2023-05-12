package bg.tu_varna.sit.visitor;

import bg.tu_varna.sit.visitor.contracts.Visitable;
import bg.tu_varna.sit.visitor.models.LargePackage;
import bg.tu_varna.sit.visitor.models.MediumPackage;
 import bg.tu_varna.sit.visitor.models.SmallPackage;
import bg.tu_varna.sit.visitor.visitors.PackageVisitor;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Visitable> packages= new ArrayList<>();
        packages.add(new SmallPackage("SMALL",10));
        packages.add(new MediumPackage("MEDIUM",20));
        packages.add(new LargePackage("LARGE",30));
        System.out.println("Total Checkout Cost:-" + calculateCost(packages));
    }

    public static double calculateCost(List<Visitable> packages) {
        PackageVisitor packageVisitor = new PackageVisitor();
        for (Visitable items : packages) {
            items.accept(packageVisitor);
        }
        return packageVisitor.getTotalCost();
    }
}

