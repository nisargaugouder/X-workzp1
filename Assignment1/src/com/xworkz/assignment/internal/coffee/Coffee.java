package com.xworkz.assignment.internal.coffee;

public class Coffee {
    private String type;
    private String size;
    private double price;

    public Coffee(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CoffeeHashCode:"+super.hashCode());
        return 822003;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Coffee){
                System.out.println("have ref.will compare..");
                Coffee coffee1=this;
                Coffee coffee2=(Coffee) obj;
                if(coffee1.price==coffee2.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
