package com.xworkz.inheritence.internal.band;

public class RubberBand extends Band {
    public RubberBand() {
        super();
        System.out.println("Running non-arg constructor RubberBand");
    }
    @Override
    public void bind() {
        System.out.println("RubberBand is used for binding--child");
    }
    @Override
    public void stretch() {
        System.out.println("RubberBand can stretch more--child");
    }
    @Override
    public void size() {
        System.out.println("RubberBand comes in various sizes--child");
    }
    @Override
    public void material() {
        System.out.println("RubberBand is made of soft elastic--child");
    }
    @Override
    public void use() {
        System.out.println("RubberBand is used in multiple ways--child");
    }
}
