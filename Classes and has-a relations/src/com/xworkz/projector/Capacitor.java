package com.xworkz.projector;

public class Capacitor {
    private int volt;
    private int price;
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
        price=200;
    }
    public Capacitor(int volt){
        this.volt=volt;
        volt=420;

    }
    public void CapDis(){
        System.out.println("Volt:"+this.volt);
        System.out.println("Price:"+this.price);
    }

}
