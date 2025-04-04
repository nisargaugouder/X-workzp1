package com.xworkz.inheritence.internal.goa;

public class NorthGoa extends Goa {
    public NorthGoa() {
        super();
        System.out.println("NorthGoa --child");
    }

    @Override
    public void beach() {
        System.out.println("NorthGoa has popular beaches like Baga --child");
    }

    @Override
    public void nightlife() {
        System.out.println("NorthGoa has lively clubs --child");
    }

    @Override
    public void forts() {
        System.out.println("NorthGoa features Aguada Fort --child");
    }

    @Override
    public void seafood() {
        System.out.println("NorthGoa serves fresh seafood --child");
    }

    @Override
    public void relax() {
        System.out.println("NorthGoa is great for a peaceful retreat --child");
    }
}
