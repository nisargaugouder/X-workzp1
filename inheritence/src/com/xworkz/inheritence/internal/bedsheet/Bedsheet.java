package com.xworkz.inheritence.internal.bedsheet;

public class Bedsheet {
    public Bedsheet() {
        System.out.println("Running non-arg constructor Bedsheet--parent");
    }
    public void cover() {
        System.out.println("Bedsheet covers the bed--parent");
    }
    public void wash() {
        System.out.println("Bedsheet is washable--parent");
    }
    public void fold() {
        System.out.println("Bedsheet can be folded--parent");
    }
    public void texture() {
        System.out.println("Bedsheet has different textures--parent");
    }
    public void design() {
        System.out.println("Bedsheet comes in various designs--parent");
    }
}
