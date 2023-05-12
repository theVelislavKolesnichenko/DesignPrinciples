package bg.tu_varna.sit.visitor.contracts;

public interface Visitable {
    void accept(Visitor visitor);
}
