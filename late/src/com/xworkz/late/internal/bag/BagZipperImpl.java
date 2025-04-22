package com.xworkz.late.internal.bag;

import com.xworkz.late.internal.body.BicepMuscleImpl;

public class BagZipperImpl implements Zipper {
    public BagZipperImpl(){
        System.out.println("no arg const");
    }
    @Override
    public void open() {
        System.out.println("Zipping the bag open");
    }
}
