
package com.xworkz.assignment.internal.clothing;

public class Clothing {
    private String type;
    private String size;
    private int price;

    public Clothing(String type, String size, int price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ClothingHashCode:"+super.hashCode());
        return 5263;
    }
}
