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

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Chips){
                System.out.println("have ref.will compare..");
                Chips chips1=this;
                Chips chips2=(Chips) obj;
                if(chips1.flavor.equals(chips2.flavor)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
