package bg.tu_varna.sit.chain_of_responsibility.models;

import bg.tu_varna.sit.chain_of_responsibility.enums.ReasonType;
import bg.tu_varna.sit.chain_of_responsibility.handlers.LeaveHandler;

public class HumanResource extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //HR може да одобри до 21 дни, в противен случай ще премине към мениджъра
        if(leave.getNumberOfDays() <= 21){
            //Нивото на служител трябва да е 3 или по-високо и типът на причината не трябва да е „Редовно“, за да получите одобрение
            if(leave.getEmpTier() <= 3 && !leave.getReason().equals(ReasonType.REGULAR)){
                return "Your leave days has been APPROVED by HR";
            }else{
                return "Your leave request has been DENIED by HR";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }
}
