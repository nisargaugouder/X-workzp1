package com.xworkz.assignment.internal.pen;

public class Pen {
    private String brand;
    private String color;
    private int price;

    public Pen() {
        System.out.println("Running no-arg constructor of Pen");
        this.brand = "Reynolds";
        this.color = "Blue";
        this.price = 10;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + " Color: " + color + " Price: " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("PenHashCode:"+super.hashCode());
        return 841;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Pen){
                System.out.println("obj instance of class");
                Pen pen1=this;
                Pen pen2=(Pen) obj;
                if(pen1.brand.equals(pen2.brand) && pen1.color.equals(pen2.color) && pen1.price==pen2.price){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
