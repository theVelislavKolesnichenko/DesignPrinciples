package bg.tu_varna.sit.state.models;

import bg.tu_varna.sit.state.contracts.PackageState;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) throws Exception {
        throw new Exception("The package is in its root state.");
    }

    @Override
    public String getStatus() {
        return "Package ordered, not delivered to the office yet.";
    }
}
