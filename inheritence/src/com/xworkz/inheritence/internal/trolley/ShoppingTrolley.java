package com.xworkz.inheritence.internal.trolley;

public class ShoppingTrolley extends Trolley {
    public ShoppingTrolley() {
        super();
        System.out.println("ShoppingTrolley --child");
    }

    @Override
    public void carry() {
        System.out.println("ShoppingTrolley carries groceries --child");
    }

    @Override
    public void wheels() {
        System.out.println("ShoppingTrolley has smooth-rolling wheels --child");
    }

    @Override
    public void material() {
        System.out.println("ShoppingTrolley is mostly plastic or steel --child");
    }

    @Override
    public void size() {
        System.out.println("ShoppingTrolley varies in capacity --child");
    }

    @Override
    public void use() {
        System.out.println("ShoppingTrolley is found in malls and stores --child");
    }
}
