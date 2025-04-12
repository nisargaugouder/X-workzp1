package com.xworkz.assignment.internal.pant;

public class Pant {
    private String brand;
    private String size;
    private String color;

    public Pant(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pant{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PantHashCode:"+super.hashCode());
        return 6320;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Pant){
                System.out.println("obj instance of class");
                Pant pant1=this;
                Pant pant2=(Pant) obj;
                if(pant1.brand.equals(pant2.brand) && pant1.color.equals(pant2.color) && pant1.size.equals(pant2.size)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
