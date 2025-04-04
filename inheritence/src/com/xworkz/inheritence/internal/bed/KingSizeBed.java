package com.xworkz.inheritence.internal.bed;

public class KingSizeBed extends Bed {
    public KingSizeBed() {
        super();
        System.out.println("Running non-arg constructor KingSizeBed");
    }
    @Override
    public void sleep() {
        System.out.println("KingSizeBed is extra spacious for sleeping--child");
    }
    @Override
    public void fold() {
        System.out.println("KingSizeBed cannot be folded easily--child");
    }
    @Override
    public void comfort() {
        System.out.println("KingSizeBed provides luxurious comfort--child");
    }
    @Override
    public void decorate() {
        System.out.println("KingSizeBed is decorated with premium bedding--child");
    }
    @Override
    public void adjust() {
        System.out.println("KingSizeBed has advanced height adjustment--child");
    }
}
