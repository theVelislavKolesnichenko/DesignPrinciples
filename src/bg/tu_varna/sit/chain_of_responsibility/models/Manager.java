package bg.tu_varna.sit.chain_of_responsibility.models;

import bg.tu_varna.sit.chain_of_responsibility.enums.ReasonType;
import bg.tu_varna.sit.chain_of_responsibility.handlers.LeaveHandler;

public class Manager extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //Само мениджърът има право да одобрява повече от 21 дни
        if (leave.getNumberOfDays() > 21) {
            //Нивото на служител трябва да е 2 или по-високо и типът на причината трябва да е „Специален“, за да получите одобрение
            if (leave.getEmpTier() <= 2 && leave.getReason().equals(ReasonType.SPECIAL)) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
        return "Your leave request has been DENIED by Manager";
    }
}
