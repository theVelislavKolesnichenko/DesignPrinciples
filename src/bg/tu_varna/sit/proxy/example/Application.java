package bg.tu_varna.sit.proxy.example;

import bg.tu_varna.sit.proxy.example.procy.ExpensiveObjectProxy;
import bg.tu_varna.sit.proxy.example.services.ExpensiveObject;

public class Application {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        System.out.println(object.getResult());
        object.process();
        System.out.println(object.getResult());
    }
}
