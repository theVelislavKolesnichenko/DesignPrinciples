package bg.tu_varna.sit.state.models;

import bg.tu_varna.sit.state.contracts.PackageState;

public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) throws Exception {
        throw new Exception("The package is in its next state.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public String getStatus() {
        return "Package received";
    }
}
