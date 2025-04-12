package com.xworkz.assignment.internal.cupboard;

public class Cupboard {
    private String type;
    private int shelves;
    private String color;

    public Cupboard(String type, int shelves, String color) {
        this.type = type;
        this.shelves = shelves;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "type='" + type + '\'' +
                ", shelves=" + shelves +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CupboardHashCode:"+super.hashCode());
        return 563;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Cupboard){
                System.out.println("have ref.will compare..");
                Cupboard cupboard1=this;
                Cupboard cupboard2=(Cupboard) obj;
                if(cupboard1.type.equals(cupboard2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
