package bg.tu_varna.sit.state.models;

import bg.tu_varna.sit.state.contracts.PackageState;

public class DeliveredState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new OrderedState());
    }

    @Override
    public String getStatus() {
        return "Package delivered to post office, not received yet.";
    }
}
