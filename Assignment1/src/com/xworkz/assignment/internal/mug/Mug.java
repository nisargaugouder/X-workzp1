package com.xworkz.assignment.internal.mug;

public class Mug {
    private String color;
    private String material;
    private int price;

    public Mug(String color, String material, int price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mug{color='" + color + "', material='" + material + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MugHashCode:"+super.hashCode());
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Mug){
                System.out.println("obj instance of class");
                Mug mug1=this;
                Mug mug2=(Mug) obj;
                if(mug1.color.equals(mug2.color) && mug1.price==mug2.price && mug1.material.equals(mug2.material)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
