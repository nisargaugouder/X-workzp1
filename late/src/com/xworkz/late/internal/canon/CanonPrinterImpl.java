package com.xworkz.late.internal.canon;

public class CanonPrinterImpl implements Canon {
    public CanonPrinterImpl() {
        System.out.println("no-arg const CanonPrinterImpl");
    }

    @Override
    public void print() {
        System.out.println("printing in CanonPrinterImpl");
    }
}
