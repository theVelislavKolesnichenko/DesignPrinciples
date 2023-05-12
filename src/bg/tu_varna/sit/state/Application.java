package bg.tu_varna.sit.state;

import bg.tu_varna.sit.state.models.OrderedState;
import bg.tu_varna.sit.state.models.Package;

public class Application {
    public static void main(String[] args) throws Exception {

        Package pkg = new Package(new OrderedState());
        System.out.println(pkg.getStatus());

        pkg.nextState();
        System.out.println(pkg.getStatus());

        pkg.nextState();
        System.out.println(pkg.getStatus());

        pkg.previousState();
        System.out.println(pkg.getStatus());
    }
}
