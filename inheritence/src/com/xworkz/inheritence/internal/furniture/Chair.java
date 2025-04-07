package com.xworkz.inheritence.internal.furniture;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("Chair --child");
    }

    @Override
    public void support() {
        System.out.println("Chair provides back support --child");
    }

    @Override
    public void material() {
        System.out.println("Chair can be wooden or plastic --child");
    }

    @Override
    public void weight() {
        System.out.println("Chair is lightweight --child");
    }

    @Override
    public void move() {
        System.out.println("Chair can be moved easily --child");
    }

    @Override
    public void design() {
        System.out.println("Chairs have different designs --child");
    }

    public void wood(){
        System.out.println("new method wood in child class");
    }
}
