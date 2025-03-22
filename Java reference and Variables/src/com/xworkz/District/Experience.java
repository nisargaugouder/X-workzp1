package com.xworkz.District;

public class Experience {
    int year;
    boolean exp;
    String compName;

    String[] ExperienceDetail={
            "4 year in TCS","2 year in TEK Syestem"
    };
    public Experience(){
        for(String exp:ExperienceDetail){
            System.out.println(exp);
        }

    }
}
