package com.xworkz.late.external.follow;

import com.xworkz.late.internal.consitution.Consitution;

public class Government {
    private Consitution consitution;

    public Government(Consitution consitution){
        this.consitution=consitution;
    }

    public void money(){
        System.out.println("running money in gvt");
        if(this.consitution!=null){
            this.consitution.followLaws();
        }
        else {
            System.out.println("error");
        }
    }
}
