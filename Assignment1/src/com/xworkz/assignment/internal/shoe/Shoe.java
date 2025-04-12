package com.xworkz.assignment.internal.shoe;

public class Shoe {
    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SlipperHashCode:"+super.hashCode());
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Shoe){
                System.out.println("obj instance of class");
                Shoe shoe1=this;
                Shoe shoe2=(Shoe) obj;
                if(shoe1.brand.equals(shoe2.brand) && shoe1.size==shoe2.size && shoe1.color.equals(shoe2.color)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
