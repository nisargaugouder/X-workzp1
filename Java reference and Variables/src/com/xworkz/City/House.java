package com.xworkz.City;

public class House {
    int[] room={
            4,5,5
    };
    String[] HouseKeep={
            "room","toilet"
    };

    public House(){
        for (int r:room){
            System.out.println(r);
        }
        for(String hk:HouseKeep){
            System.out.println(hk);
        }
    }
}
