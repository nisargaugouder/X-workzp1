package com.xworkz.assignment.internal.broom;

public class Broom {
    private int length;
    private String size;
    private String use;

    public Broom(int length,String size,String use){
        this.length=length;
        this.size=size;
        this.use=use;
    }

    @Override
    public String toString() {
        return
                "length=" + length +
                ", size='" + size +
                ", use= " + use;
    }
}
