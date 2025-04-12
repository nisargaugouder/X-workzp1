package com.xworkz.assignment.internal.tea;

public class Tea {
    private String variety;
    private boolean hasMilk;
    private double price;

    public Tea(String variety, boolean hasMilk, double price) {
        this.variety = variety;
        this.hasMilk = hasMilk;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "variety='" + variety + '\'' +
                ", hasMilk=" + hasMilk +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("TeaHashCode:"+super.hashCode());
        return 45;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Tea){
                System.out.println("obj instance of class");
                Tea tea1=this;
                Tea tea2=(Tea) obj;
                if(tea1.hasMilk==tea2.hasMilk && tea1.price==tea2.price && tea1.variety.equals(tea2.variety)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
