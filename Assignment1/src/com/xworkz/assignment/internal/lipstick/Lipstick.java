package com.xworkz.assignment.internal.lipstick;

public class Lipstick {
    private String brand;
    private String shade;
    private int price;

    public Lipstick(String brand, String shade, int price) {
        this.brand = brand;
        this.shade = shade;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lipstick{brand='" + brand + "', shade='" + shade + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LipstickHashCode:"+super.hashCode());
        return 8332;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Lipstick){
                System.out.println("have ref.will compare..");
                Lipstick lipstick1=this;
                Lipstick lipstick2=(Lipstick) obj;
                if(lipstick1.brand.equals(lipstick2.brand) && lipstick1.price==lipstick2.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
