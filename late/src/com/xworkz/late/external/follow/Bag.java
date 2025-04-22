package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bag.Zipper;

public class Bag {
    private Zipper zipper;

    public Bag(Zipper zipper) {
        this.zipper = zipper;
    }

    public void unzip() {
        System.out.println("Unzipping the bag");
        if(this.zipper!=null){
            this.zipper.open();
        }
        else {
            System.out.println("err");
        }
    }
}
