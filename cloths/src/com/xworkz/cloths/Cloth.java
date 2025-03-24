package com.xworkz.cloths;

public class Cloth {
    public String size;
    private String brand="LV";
    int num;

    public void color(){
        size="XS";
        System.out.println("Size is:"+this.size);
        System.out.println("Brand is:"+this.brand);
        System.out.println("Number of cloth:"+this.num);
    }
    private void design(){
        System.out.println("running design");
    }
    void brand(){
        System.out.println("running brand");
    }
}
