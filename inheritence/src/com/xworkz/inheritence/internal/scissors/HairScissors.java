package com.xworkz.inheritence.internal.scissors;

public class HairScissors extends Scissors {
    public HairScissors() {
        super();
        System.out.println("HairScissors --child");
    }

    @Override
    public void cut() {
        System.out.println("HairScissors are used for cutting hair --child");
    }

    @Override
    public void sharp() {
        System.out.println("HairScissors have ultra-sharp blades --child");
    }

    @Override
    public void home() {
        System.out.println("HairScissors are mainly used in salons --child");
    }

    @Override
    public void size() {
        System.out.println("HairScissors come in various lengths --child");
    }

    @Override
    public void handle() {
        System.out.println("HairScissors need careful handling --child");
    }
}
