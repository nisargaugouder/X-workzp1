package com.xworkz.late.external.follow;

import com.xworkz.late.internal.ipl.Icc;

public class BCC {
    private Icc icc;
    public BCC(Icc icc){
        this.icc=icc;
    }
    public void play(){
        System.out.println("running play in BCC");
        if(icc!=null){
            this.icc.fairPlay();
        }
        else{
            System.out.println("error");
        }
    }
}
