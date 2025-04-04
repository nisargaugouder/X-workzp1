package com.xworkz.inheritence.internal.tool;

public class Hammer extends Tool {
    public Hammer() {
        super();
        System.out.println("Hammer --child");
    }

    @Override
    public void use() {
        System.out.println("Hammer is used for driving nails --child");
    }

    @Override
    public void material() {
        System.out.println("Hammer is made of steel and wood --child");
    }

    @Override
    public void grip() {
        System.out.println("Hammer has a rubberized grip --child");
    }

    @Override
    public void durability() {
        System.out.println("Hammer is strong and long-lasting --child");
    }

    @Override
    public void weight() {
        System.out.println("Hammer is balanced for easy use --child");
    }
}
