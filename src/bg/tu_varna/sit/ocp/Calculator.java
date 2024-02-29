package bg.tu_varna.sit.ocp;

import java.io.InvalidObjectException;
import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) throws InvalidObjectException {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        operation.perform();
    }
}
