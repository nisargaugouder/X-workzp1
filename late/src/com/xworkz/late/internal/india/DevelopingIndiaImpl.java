package com.xworkz.late.internal.india;

public class DevelopingIndiaImpl implements India {
    public DevelopingIndiaImpl() {
        System.out.println("no-arg const DevelopingIndiaImpl");
    }

    @Override
    public void grow() {
        System.out.println("DevelopingIndiaImpl is growing");
    }
}
