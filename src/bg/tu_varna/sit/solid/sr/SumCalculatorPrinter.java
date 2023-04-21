package bg.tu_varna.sit.solid.sr;

public class SumCalculatorPrinter {
    private final AreaCalculator calculator;

    public SumCalculatorPrinter(AreaCalculator calculator) {
        this.calculator = calculator;
    }

    public String print() {
        return String.format("Сумата от площа на фигурите е: %s", this.calculator.sum());
    }

    public String json() {
        return String.format("{'sum': %s}", this.calculator.sum());
    }

    public String xml() {
        return String.format("<sum> %s <\\sum>", this.calculator.sum());
    }
}
