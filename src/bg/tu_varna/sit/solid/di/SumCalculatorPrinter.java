package bg.tu_varna.sit.solid.di;

public class SumCalculatorPrinter {
    private final AreaCalculator calculator;

    public SumCalculatorPrinter(AreaCalculator calculator) {
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
