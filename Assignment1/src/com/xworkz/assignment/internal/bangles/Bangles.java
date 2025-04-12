package com.xworkz.assignment.internal.bangles;

public class Bangles {
    private String material;
    private String color;
    private int quantity;

    public Bangles() {
        System.out.println("Running no-arg constructor of Bangles");
        this.material = "Gold";
        this.color = "Yellow";
        this.quantity = 2;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Color: " + color + ", Quantity: " + quantity;
    }

    @Override
    public int hashCode() {
        System.out.println("BangleHashCode"+super.hashCode());
        return 76;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Bangles){
                System.out.println("have ref.will compare..");
                Bangles bangles1=this;
                Bangles bangles2=(Bangles) obj;
                if(bangles1.color.equals(bangles2.color)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
