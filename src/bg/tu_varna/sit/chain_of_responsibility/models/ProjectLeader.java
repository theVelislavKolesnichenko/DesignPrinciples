package bg.tu_varna.sit.chain_of_responsibility.models;

import bg.tu_varna.sit.chain_of_responsibility.handlers.LeaveHandler;

public class ProjectLeader extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //"reasonType" няма да се разглежда като Ръководител на екип и Ръководител на проекта
        //Ръководителят на проекта може да одобри до 14 дни, в противен случай ще премине към HR
        if(leave.getNumberOfDays() <= 14){
            //Нивото на служител трябва да е 3 или по-високо, за да бъдете одобрени
            if (leave.getEmpTier() <= 3) {
                return "Your leave days has been APPROVED by Project Leader";
            } else {
                return "You employee Tier level is too low for request " + leave.getNumberOfDays() + " days";
            }
        }else{
            return superVisor.applyLeave(leave);
        }
    }
}
