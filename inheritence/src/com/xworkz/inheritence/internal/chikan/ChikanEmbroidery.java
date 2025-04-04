package com.xworkz.inheritence.internal.chikan;

public class ChikanEmbroidery extends Chikan {
    public ChikanEmbroidery() {
        super();
        System.out.println("Running non-arg constructor ChikanEmbroidery--child");
    }

    @Override
    public void art() {
        System.out.println("ChikanEmbroidery is a refined traditional art--child");
    }

    @Override
    public void handMade() {
        System.out.println("ChikanEmbroidery is handcrafted with precision--child");
    }

    @Override
    public void origin() {
        System.out.println("ChikanEmbroidery has deep roots in Lucknow--child");
    }

    @Override
    public void design() {
        System.out.println("ChikanEmbroidery features intricate designs--child");
    }

    @Override
    public void fabric() {
        System.out.println("ChikanEmbroidery is beautifully done on fabrics--child");
    }
}
