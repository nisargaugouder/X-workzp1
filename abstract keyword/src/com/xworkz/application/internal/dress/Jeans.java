package com.xworkz.application.internal.dress;

public class Jeans extends Dress{
    public Jeans(){
        System.out.println("no-arg const");
    }
    @Override
    public void wear() {
        System.out.println("overriden abstract method");
    }
}
