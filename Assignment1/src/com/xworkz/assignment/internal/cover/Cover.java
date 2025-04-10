package com.xworkz.assignment.internal.cover;

public class Cover {
    private String type;
    private String material;
    private int price;

    public Cover(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CoverHashCode:"+super.hashCode());
        return 623;
    }
}
