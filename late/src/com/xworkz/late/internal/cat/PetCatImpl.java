package com.xworkz.late.internal.cat;

public class PetCatImpl implements Cat {
    public PetCatImpl() {
        System.out.println("no-arg const PetCatImpl");
    }

    @Override
    public void meow() {
        System.out.println("meowww from PetCatImpl");
    }
}
