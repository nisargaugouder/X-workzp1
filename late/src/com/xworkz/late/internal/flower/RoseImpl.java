package com.xworkz.late.internal.flower;

public class RoseImpl implements Flower {
    public RoseImpl() {
        System.out.println("no-arg const RoseImpl");
    }

    @Override
    public void smell() {
        System.out.println("RoseImpl smells nice");
    }
}
