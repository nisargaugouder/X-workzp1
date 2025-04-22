package com.xworkz.late.internal.leaf;

public class GreenLeafImpl implements Leaf {
    public GreenLeafImpl() {
        System.out.println("no-arg const GreenLeafImpl");
    }

    @Override
    public void photosynthesize() {
        System.out.println("GreenLeafImpl is photosynthesizing");
    }
}
