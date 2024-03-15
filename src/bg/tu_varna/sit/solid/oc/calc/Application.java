package bg.tu_varna.sit.solid.oc.calc;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Addition addition = new Addition(1,2);
        calculator.calculate(addition);
        System.out.println(addition.getResult());

        Subtraction subtraction = new Subtraction(1,2);
        calculator.calculate(subtraction);
        System.out.println(subtraction.getResult());

        Multiplication multiplication = new Multiplication(1,2);
        calculator.calculate(multiplication);
        System.out.println(multiplication.getResult());

        Division division = new Division(1,0);
        calculator.calculate(division);
        System.out.println(division.getResult());
    }
}
