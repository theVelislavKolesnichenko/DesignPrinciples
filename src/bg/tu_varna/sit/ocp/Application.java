package bg.tu_varna.sit.ocp;

import java.io.InvalidObjectException;

public class Application {
    public static void main(String[] args) throws InvalidObjectException {
        Calculator calculator = new Calculator();

        Addition addition = new Addition(5, 7);
        calculator.calculate(addition);
        System.out.println(addition.getResult());

        Subtraction subtraction = new Subtraction(5, 7);
        calculator.calculate(subtraction);
        System.out.println(subtraction.getResult());

        Multiplication multiplication = new Multiplication(5, 7);
        calculator.calculate(multiplication);
        System.out.println(multiplication.getResult());

        Division division = new Division(5, 7);
        calculator.calculate(division);
        System.out.println(division.getResult());
    }
}
