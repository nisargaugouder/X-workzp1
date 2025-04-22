package com.xworkz.late.internal.japan;

public class TechnologyJapanImpl implements Japan {
    public TechnologyJapanImpl() {
        System.out.println("no-arg const TechnologyJapanImpl");
    }

    @Override
    public void innovate() {
        System.out.println("TechnologyJapanImpl is innovating");
    }
}
