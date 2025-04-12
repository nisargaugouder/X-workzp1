package com.xworkz.assignment.internal.food;

public class Food {
    private String name;
    private double price;
    private String type;

    public Food(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Food{name=" + name + ", price=" + price + ", type=" + type + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FoodHashCode:"+super.hashCode());
        return 8741;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Food){
                System.out.println("have ref.will compare..");
                Food food1=this;
                Food food2= (Food) obj;
                if(food1.name.equals(food2.name) && food2.type.equals(food2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
