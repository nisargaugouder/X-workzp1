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
}
