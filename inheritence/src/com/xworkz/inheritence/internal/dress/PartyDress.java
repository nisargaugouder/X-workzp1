package com.xworkz.inheritence.internal.dress;

public class PartyDress extends Dress {

    @Override
    public void wear() {
        System.out.println("Running wear in PartyDress");
    }

    @Override
    public void style() {
        System.out.println("Running style in PartyDress");
    }

    @Override
    public void gender() {
        System.out.println("Running gender in PartyDress");
    }

    @Override
    public void comfort() {
        System.out.println("Running comfort in PartyDress");
    }

    @Override
    public void material() {
        System.out.println("Running material in PartyDress");
    }

    public void sparkle() {
        System.out.println("PartyDress has sparkle effect");
    }
}
