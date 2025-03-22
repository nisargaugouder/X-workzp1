package com.xworkz.City;

import com.xworkz.District.Ward;

public class City {
    String[] Ward={
            "floor","place"
    };
    public City(){
        for(String ward: Ward){
            System.out.println(ward);
        }
    }
}
