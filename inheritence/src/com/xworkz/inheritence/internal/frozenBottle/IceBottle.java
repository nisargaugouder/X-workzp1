package com.xworkz.inheritence.internal.frozenBottle;

public class IceBottle extends FrozenBottle {
    public IceBottle() {
        super();
        System.out.println("IceBottle --child");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing water quickly --child");
    }

    @Override
    public void cold() {
        System.out.println("Maintains cold temperature --child");
    }

    @Override
    public void cool() {
        System.out.println("Effective for cooling drinks --child");
    }

    @Override
    public void melt() {
        System.out.println("Melts very slowly --child");
    }

    @Override
    public void carry() {
        System.out.println("Portable and lightweight --child");
    }
}
