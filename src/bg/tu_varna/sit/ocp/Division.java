package bg.tu_varna.sit.ocp;

import java.io.InvalidObjectException;

public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result = 0.0;

    public Division(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public double getResult() {
        return result;
    }

    @Override
    public void perform() throws InvalidObjectException {
        if (this.right == 0) {
            throw new InvalidObjectException("Zero");
        }

        this.result = this.left / this.right;
    }
}
