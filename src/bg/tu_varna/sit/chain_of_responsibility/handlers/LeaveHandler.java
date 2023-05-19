package bg.tu_varna.sit.chain_of_responsibility.handlers;

import bg.tu_varna.sit.chain_of_responsibility.models.Leave;

public abstract class LeaveHandler {

    protected LeaveHandler superVisor;

    public void setSuperVisor(LeaveHandler superVisor) {
        this.superVisor = superVisor;
    }

    public abstract String applyLeave(Leave leave);
}