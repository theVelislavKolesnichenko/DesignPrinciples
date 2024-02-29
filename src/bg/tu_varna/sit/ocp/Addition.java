package bg.tu_varna.sit.ocp;

public class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public void perform() {
        this.result = this.left + this.right;
    }

    public double getResult() {
        return this.result;
    }
}