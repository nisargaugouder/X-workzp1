package com.xworkz.inheritence.internal.hair;

public class CurlyHair extends Hair {
    public CurlyHair() {
        super();
        System.out.println("CurlyHair --child");
    }

    @Override
    public void protect() {
        System.out.println("Curly hair protects from sun exposure --child");
    }

    @Override
    public void grow() {
        System.out.println("Curly hair grows in spirals --child");
    }

    @Override
    public void style() {
        System.out.println("Curly hair can be styled into waves --child");
    }

    @Override
    public void maintain() {
        System.out.println("Curly hair needs extra hydration --child");
    }

    @Override
    public void keratin() {
        System.out.println("Curly hair has a unique keratin structure --child");
    }
}
