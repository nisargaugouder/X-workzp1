package com.xworkz.inheritence.internal.dress;

public class PartyDress extends Dress {
    public PartyDress() {
        super();
        System.out.println("Running non-arg constructor PartyDress--child");
    }

    @Override
    public void wear() {
        System.out.println("Party dress is stylish--child");
    }

    @Override
    public void style() {
        System.out.println("Party dress has elegant styles--child");
    }

    @Override
    public void gender() {
        System.out.println("Party dress suits all genders--child");
    }

    @Override
    public void comfort() {
        System.out.println("Party dress is comfortable--child");
    }

    @Override
    public void material() {
        System.out.println("Party dress is made from premium fabric--child");
    }
}
