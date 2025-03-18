package com.xworkz.cloud2.Barber;

public class BarberRunner {

    public static void main(String[] args) {
        Barber barber=new Barber();
        Cutting cutting=new Cutting();
        cutting.scissor(barber);
    }
}

