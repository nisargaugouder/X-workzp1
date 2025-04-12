package com.xworkz.assignment.internal.wine;

public class Wine {
    private String brand;
    private String type;
    private int price;

    public Wine(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("WineHashCode:"+super.hashCode());
        return 5421;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Wine){
                System.out.println("obj instance of class");
                Wine wine1=this;
                Wine wine2=(Wine) obj;
                if(wine1.brand.equals(wine2.brand) && wine1.type.equals(wine2.type) && wine1.price==wine2.price){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
