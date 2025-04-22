package com.xworkz.late.internal.laptop;

public class LaptopImpli implements Laptop{
    public LaptopImpli(){
        System.out.println("no-arg const LaptopImpli");
    }

    @Override
    public void process() {
        System.out.println("running process in LapImpli");
    }
}
