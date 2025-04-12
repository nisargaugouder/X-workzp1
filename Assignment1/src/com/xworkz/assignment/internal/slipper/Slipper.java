package com.xworkz.assignment.internal.slipper;

public class Slipper {
    private String brand;
    private String material;
    private int size;

    public Slipper(String brand, String material, int size) {
        this.brand = brand;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Slipper{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SlipperHashCode:"+super.hashCode());
        return 82;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Slipper){
                System.out.println("obj instance of class");
                Slipper slipper1=this;
                Slipper slipper2=(Slipper) obj;
                if(slipper1.brand.equals(slipper2.brand) && slipper1.size==slipper2.size && slipper1.material.equals(slipper2.material)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
