package bg.tu_varna.sit.visitor.contracts;

import bg.tu_varna.sit.visitor.models.LargePackage;
import bg.tu_varna.sit.visitor.models.MediumPackage;
import bg.tu_varna.sit.visitor.models.SmallPackage;

public interface Visitor {
    void visit(SmallPackage smallPackage);
    void visit(MediumPackage mediumPackage);
    void visit(LargePackage largePackage);
}
