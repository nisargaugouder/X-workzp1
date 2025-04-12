package com.xworkz.assignment.internal.frozenbottle;

public class FrozenBottle {
    private String flavor;
    private double price;
    private String type;

    public FrozenBottle(String flavor, double price, String type) {
        this.flavor = flavor;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "FrozenBottle{flavor=" + flavor + ", price=" + price + ", type=" + type + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("FrozenHashCode:"+super.hashCode());
        return 85;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof FrozenBottle){
                System.out.println("have ref.will compare..");
                FrozenBottle frozenBottle1=this;
                FrozenBottle frozenBottle2=(FrozenBottle) obj;
                if(frozenBottle1.flavor.equals(frozenBottle2.flavor) && frozenBottle1.type.equals(frozenBottle2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
