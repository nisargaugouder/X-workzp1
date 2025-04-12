package com.xworkz.assignment.internal.watch;

public class Watch {
    private String brand;
    private String type;
    private double price;

    public Watch(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("WatchHashCode:"+super.hashCode());
        return 643;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Watch){
                System.out.println("obj instance of class");
                Watch watch1=this;
                Watch watch2=(Watch) obj;
                if(watch1.brand.equals(watch2.brand) && watch1.type.equals(watch2.type) && watch1.price==watch2.price){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
