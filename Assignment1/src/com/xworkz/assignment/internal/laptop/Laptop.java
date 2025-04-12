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
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Laptop){
                System.out.println("have ref.will compare..");
                Laptop laptop1=this;
                Laptop laptop2=(Laptop) obj;
                if(laptop1.brand.equals(laptop2.brand) && laptop1.price==laptop2.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
