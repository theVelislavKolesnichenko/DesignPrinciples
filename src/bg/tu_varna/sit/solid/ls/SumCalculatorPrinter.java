package bg.tu_varna.sit.solid.ls;

public class SumCalculatorPrinter {
    private final Calculator calculator;

    public SumCalculatorPrinter(Calculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        return String.format("сума: %s", this.calculator.sum());
    }

    public String json() {
        return String.format("{'sum': %s}", this.calculator.sum());
    }

    public String xml() {
        return String.format("<sum> %s <\\sum>", this.calculator.sum());
    }
}
