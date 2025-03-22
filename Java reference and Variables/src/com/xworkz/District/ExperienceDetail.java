package com.xworkz.District;

public class ExperienceDetail {
    String place;
    int noOfYear;

    String[] education ={
            "B.E","BCA"
    };
    public ExperienceDetail(){
        for (String expi:education){
            System.out.println(expi);
        }
    }

}
