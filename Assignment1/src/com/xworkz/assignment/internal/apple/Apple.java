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

    @Override
    public int hashCode() {
        System.out.println("AppleHashCode:"+super.hashCode());
        return 412;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            Apple apple1=this;
            Apple apple2=(Apple) obj;
            if(obj instanceof Apple){
                System.out.println("have ref.will compare..");
                if(apple1.sweet==apple2.sweet){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
