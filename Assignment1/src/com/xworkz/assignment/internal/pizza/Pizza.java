package com.xworkz.assignment.internal.pizza;

public class Pizza {
    private String size;
    private String crustType;
    private String[] toppings;

    public Pizza(String size, String crustType, String[] toppings) {
        this.size = size;
        this.crustType = crustType;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", toppings=" + String.join(", ", toppings) +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PizzaHashCode:"+super.hashCode());
        return 72;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Pizza){
                System.out.println("obj instance of class");
                Pizza pizza1=this;
                Pizza pizza2=(Pizza) obj;
                if(pizza1.crustType.equals(pizza2.crustType) && pizza1.toppings.equals(pizza2.toppings) && pizza1.size.equals(pizza2.size)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
