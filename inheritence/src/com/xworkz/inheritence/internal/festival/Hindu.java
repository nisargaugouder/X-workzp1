package com.xworkz.inheritence.internal.festival;

public class Hindu {
    public void celebrate(Festival festival){
        festival.celebrate();
        festival.food();
        festival.gathering();
        festival.traditions();
        festival.holidays();

        if(festival instanceof Diwali){
            System.out.println("festival instanceof Diwali");
            Diwali diwali=(Diwali) festival;
            diwali.holiday();
        }

    }
}
