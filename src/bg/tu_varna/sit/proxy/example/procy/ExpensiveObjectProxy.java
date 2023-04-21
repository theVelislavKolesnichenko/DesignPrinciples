package bg.tu_varna.sit.proxy.example.procy;

import bg.tu_varna.sit.proxy.example.services.ExpensiveObject;
import bg.tu_varna.sit.proxy.example.services.ExpensiveObjectImpl;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }

    @Override
    public String getResult() {
        return object.getResult();
    }
}
