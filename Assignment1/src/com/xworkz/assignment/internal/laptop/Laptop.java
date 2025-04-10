package com.xworkz.assignment.internal.laptop;

public class Laptop {
    private String brand;
    private int price;
    private String processor;

    public Laptop(String brand, int price, String processor) {
        this.brand = brand;
        this.price = price;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', price=" + price + ", processor='" + processor + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("LaptopHashCode:"+super.hashCode());
        return 7;
    }
}
