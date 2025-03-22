package com.xworkz.District;

public class HouseKeep {
    int noOfPeople;
    String Name;

    String[] Transport ={
      "Bus","Train","Plane" ,"Boat"
    };
    public HouseKeep(){
        for(String tra:Transport){
            System.out.println(tra);
        }
    }
}
