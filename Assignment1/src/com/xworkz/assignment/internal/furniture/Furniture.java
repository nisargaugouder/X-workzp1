package com.xworkz.assignment.internal.furniture;

public class Furniture {
    private String type;
    private String material;
    private double price;

    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{type=" + type + ", material=" + material + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FurnitureHashCode:"+super.hashCode());
        return 634;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Furniture){
                System.out.println("have ref.will compare..");
                Furniture furniture1=this;
                Furniture furniture2=(Furniture) obj;
                if(furniture1.material.equals(furniture2.material) && furniture2.type.equals(furniture1.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
