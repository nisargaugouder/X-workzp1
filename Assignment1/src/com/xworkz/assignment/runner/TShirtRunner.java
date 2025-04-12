package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.tshirt.TShirt;

public class TShirtRunner {
    public static void main(String[] args) {
        TShirt tShirt1=new TShirt();
        tShirt1.setBrand("X-Workz");
        tShirt1.setSize("XS");
        tShirt1.setColor("black");

        TShirt tShirt2=new TShirt();
        tShirt2.setColor("black");
        tShirt2.setSize("S");
        tShirt2.setBrand("X-Workz");

        boolean same=tShirt1.equals(tShirt2);
        System.out.println("both same:"+same);
    }
}
