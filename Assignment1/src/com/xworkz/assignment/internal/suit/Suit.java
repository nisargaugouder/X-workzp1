package com.xworkz.assignment.internal.suit;

public class Suit {
    private String material;
    private String color;
    private String size;

    public Suit(String material, String color, String size) {
        this.material = material;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Suit{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("SuitHashCode:"+super.hashCode());
        return 545;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Suit){
                System.out.println("obj instance of class");
                Suit suit1=this;
                Suit suit2=(Suit) obj;
                if(suit1.color.equals(suit2.color) && suit1.size.equals(suit2.size) && suit1.material.equals(suit2.material)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
