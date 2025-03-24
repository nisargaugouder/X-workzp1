package com.xworkz.bag;

public class Size {
    public String shape;
    private int pick=10;
    boolean present;

    public void color(){
        shape="Square";
        System.out.println("bag shape:"+this.shape);
        System.out.println("bag pick:"+this.pick);
        System.out.println("bag present:"+this.present);
    }
    private void zip(){
        System.out.println("running zip");
    }
    void numZip(){
        System.out.println("running numZip");
    }
}
