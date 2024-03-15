package bg.tu_varna.sit.chain_of_responsibility.models;

import bg.tu_varna.sit.chain_of_responsibility.handlers.LeaveHandler;

public class TeamLeader extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {

        //"reasonType" няма да се разглежда като Ръководител на екип и Ръководител на проекта
        //Ръководителят на екипа може да одобри до 7 дни, в противен случай ще премине към ръководителя на проекта
        if (leave.getNumberOfDays() <= 7) {
            //Нивото на служител трябва да е 4 или по-високо, за да бъдете одобрени
            if(leave.getEmpTier() <= 4){
                return "Your leave days has been APPROVED by TeamLeader";
            } else {
                return "You employee Tier level is too low for request " + leave.getNumberOfDays() + " days";
            }
        } else {
            return superVisor.applyLeave(leave);
        }
    }
}