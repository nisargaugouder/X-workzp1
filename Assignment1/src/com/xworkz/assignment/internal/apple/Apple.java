package com.xworkz.assignment.internal.apple;

public class Apple {
    private int number;
    private String size;
    private boolean sweet;

    public Apple(){
        System.out.println("running non-arg constructor Apple");
        System.out.println("number:"+this.number);
        this.number=0;
        this.size="XL";
        this.sweet=true;
    }
    @Override
    public String toString(){
        return "Number:" +number +"Size:"+size +"Sweet:"+sweet;
    }
}
