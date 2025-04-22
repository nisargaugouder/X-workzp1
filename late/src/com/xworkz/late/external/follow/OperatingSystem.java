package com.xworkz.late.external.follow;

import com.xworkz.late.internal.laptop.Laptop;

public class OperatingSystem {
    private Laptop laptop;
    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
    }

    public void windows(){
        System.out.println("running windows in os");
        if(this.laptop!=null){
            this.laptop.process();
        }
        else {
            System.out.println("error");
        }
    }
}
