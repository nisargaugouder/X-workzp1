package com.xworkz.inheritence.internal.clothing;

public class TShirt extends Clothing {
    public TShirt() {
        super();
        System.out.println("Running non-arg constructor TShirt--child");
    }

    @Override
    public void wear() {
        System.out.println("TShirt is worn casually--child");
    }

    @Override
    public void fabric() {
        System.out.println("TShirt is made of cotton or polyester--child");
    }

    @Override
    public void fit() {
        System.out.println("TShirt comes in slim and regular fit--child");
    }

    @Override
    public void label() {
        System.out.println("TShirt has branded and non-branded options--child");
    }

    @Override
    public void style() {
        System.out.println("TShirt comes in various styles--child");
    }
}
