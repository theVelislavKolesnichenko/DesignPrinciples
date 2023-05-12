package bg.tu_varna.sit.state.models;

import bg.tu_varna.sit.state.contracts.PackageState;

public class Package {
    private PackageState state;

    public Package(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() throws Exception {
        state.prev(this);
    }

    public void  nextState() throws Exception {
        state.next(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
