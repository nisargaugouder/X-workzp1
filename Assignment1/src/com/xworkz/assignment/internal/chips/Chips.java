package com.xworkz.assignment.internal.chips;

public class Chips {
    private String flavor;
    private int quantity;
    private int price;

    public Chips(String flavor, int quantity, int price) {
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "flavor='" + flavor + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ChipsHashCode:"+super.hashCode());
        return 56;
    }
}
