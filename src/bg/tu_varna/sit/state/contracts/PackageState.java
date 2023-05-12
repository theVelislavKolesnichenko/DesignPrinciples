package bg.tu_varna.sit.state.contracts;

import bg.tu_varna.sit.state.models.Package;

public interface PackageState {
    void next(Package pkg) throws Exception;
    void prev(Package pkg) throws Exception;
    String getStatus();
}
