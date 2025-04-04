package com.xworkz.inheritence.internal.towel;

public class BathTowel extends Towel {
    public BathTowel() {
        super();
        System.out.println("BathTowel --child");
    }

    @Override
    public void absorb() {
        System.out.println("BathTowel absorbs water quickly --child");
    }

    @Override
    public void material() {
        System.out.println("BathTowel is made of soft cotton --child");
    }

    @Override
    public void size() {
        System.out.println("BathTowel is larger in size --child");
    }

    @Override
    public void use() {
        System.out.println("BathTowel is used after a shower --child");
    }

    @Override
    public void wash() {
        System.out.println("BathTowel needs frequent washing --child");
    }
}
