package com.xworkz.application.internal.orange;

public abstract class Orange {
    private String size;
    private int rate;
    private boolean sour;

    public Orange(String size,int rate,boolean sour){
        this.size=size;
        this.rate=rate;
        this.sour=sour;
    }
}
