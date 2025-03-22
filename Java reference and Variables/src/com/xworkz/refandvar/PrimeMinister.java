package com.xworkz.refandvar;

public class PrimeMinister {
    String[] Minister={
            "Home minister","CM"
    };
    boolean[] Portfolio={
            true,false
    };
    String[] State={
            "Karnataka","Andra"
    };

    public PrimeMinister(){
        for(String pm:Minister){
            System.out.println(pm);
        }
        for (boolean p:Portfolio){
            System.out.println(p);
        }
        for (String state:State){
            System.out.println(state);
        }
    }




}
