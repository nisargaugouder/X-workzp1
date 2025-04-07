package com.xworkz.inheritence.internal.clothing;

public class TShirt extends Clothing {

    public TShirt() {
        super();
        System.out.println("Running no-arg constructor of TShirt -- Child Class");
    }

    @Override
    public void wear() {
        System.out.println("Wearing TShirt -- Child Class");
    }

    @Override
    public void fabric() {
        System.out.println("Fabric of TShirt -- Child Class");
    }

    @Override
    public void fit() {
        System.out.println("Fit of TShirt -- Child Class");
    }

    @Override
    public void label() {
        System.out.println("Label of TShirt -- Child Class");
    }

    @Override
    public void style() {
        System.out.println("Style of TShirt -- Child Class");
    }

    public void brand() {
        System.out.println("Brand of TShirt -- Extra Method in Child Class");
    }
}
