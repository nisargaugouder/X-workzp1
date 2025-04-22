package com.xworkz.late.internal.ipl;

public class IndianCricketTeamIccImpl implements Icc{
    public IndianCricketTeamIccImpl(){
        System.out.println("no arg const of IndianCricketTeamIccImpl");
    }

    @Override
    public void fairPlay() {
        System.out.println("running fairPlay in IndianCricketTeamIccImpl");
    }
}
