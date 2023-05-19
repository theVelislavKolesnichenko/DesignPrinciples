package bg.tu_varna.sit.chain_of_responsibility.models;

import bg.tu_varna.sit.chain_of_responsibility.enums.ReasonType;

public class Leave {

    private int numberOfDays;
    private int empTier;
    private ReasonType reason;

    public Leave(int numberOfDays, int empTier, ReasonType reason) {
        this.numberOfDays = numberOfDays;
        this.empTier = empTier;
        this.reason = reason;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getEmpTier() {
        return empTier;
    }

    public ReasonType getReason() {
        return reason;
    }
}
