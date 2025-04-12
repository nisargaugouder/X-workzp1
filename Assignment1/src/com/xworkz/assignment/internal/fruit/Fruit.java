package com.xworkz.assignment.internal.fruit;

public class Fruit {
    private String name;
    private String color;
    private double price;

    public Fruit(String name, String color, double price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{name=" + name + ", color=" + color + ", price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FruitHashCode:"+super.hashCode());
        return 3669;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Fruit){
                System.out.println("have ref.will compare..");
                Fruit fruit1=this;
                Fruit fruit2=(Fruit) obj;
                if(fruit1.name.equals(fruit2.name) && fruit2.color.equals(fruit2.color)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
