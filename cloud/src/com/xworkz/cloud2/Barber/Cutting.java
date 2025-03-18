package com.xworkz.cloud2.Barber;

public class Cutting {
    void scissor(Barber barber){
        if(barber!=null){
            barber.work();
        }
        else{
            System.out.println("is null");
        }
    }
}
