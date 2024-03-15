package bg.tu_varna.sit.solid.oc.calc;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        operation.perform();
    }
}
