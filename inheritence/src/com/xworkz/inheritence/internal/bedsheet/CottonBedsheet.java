package com.xworkz.inheritence.internal.bedsheet;

public class CottonBedsheet extends Bedsheet {
    public CottonBedsheet() {
        super();
        System.out.println("Running non-arg constructor CottonBedsheet");
    }
    @Override
    public void cover() {
        System.out.println("CottonBedsheet covers the bed smoothly--child");
    }
    @Override
    public void wash() {
        System.out.println("CottonBedsheet is easy to wash--child");
    }
    @Override
    public void fold() {
        System.out.println("CottonBedsheet folds neatly--child");
    }
    @Override
    public void texture() {
        System.out.println("CottonBedsheet has a soft texture--child");
    }
    @Override
    public void design() {
        System.out.println("CottonBedsheet has elegant designs--child");
    }
}
