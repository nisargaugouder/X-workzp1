package com.xworkz.assignment.internal.cup;

public class Cup {
    private String type;
    private int price;
    private String material;

    public Cup(String type, int price, String material) {
        this.type = type;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }
}
