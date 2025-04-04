package com.xworkz.inheritence.internal.suit;

public class WeddingSuit extends Suit {
    public WeddingSuit() {
        super();
        System.out.println("WeddingSuit --child");
    }

    @Override
    public void wear() {
        System.out.println("WeddingSuit is worn on weddings --child");
    }

    @Override
    public void fabric() {
        System.out.println("WeddingSuit is made of luxurious fabric --child");
    }

    @Override
    public void style() {
        System.out.println("WeddingSuit is designed elegantly --child");
    }

    @Override
    public void personality() {
        System.out.println("WeddingSuit gives a classy look --child");
    }

    @Override
    public void fitting() {
        System.out.println("WeddingSuit must have a perfect fit --child");
    }
}
