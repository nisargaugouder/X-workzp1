package com.xworkz.assignment.internal.suger;

public class Suger {
    private String type;
    private int price;
    private String color;

    public Suger(String type, int price, String color) {
        this.type = type;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Suger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SugerHashCode:"+super.hashCode());
        return 54;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Suger){
                System.out.println("obj instance of class");
                Suger suger1=this;
                Suger suger2=(Suger) obj;
                if(suger1.color.equals(suger2.color) && suger1.price==suger2.price && suger1.type.equals(suger2.type)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
