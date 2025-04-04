package com.xworkz.inheritence.internal.pen;

public class BallPen extends Pen {
    public BallPen() {
        super();
        System.out.println("BallPen --child");
    }

    @Override
    public void write() {
        System.out.println("BallPen writes smoothly --child");
    }

    @Override
    public void inkFlow() {
        System.out.println("BallPen has controlled ink flow --child");
    }

    @Override
    public void cap() {
        System.out.println("BallPen has a click mechanism --child");
    }

    @Override
    public void refill() {
        System.out.println("BallPen refills are replaceable --child");
    }

    @Override
    public void grip() {
        System.out.println("BallPen has a rubber grip for comfort --child");
    }
}
