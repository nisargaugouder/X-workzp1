package com.xworkz.assignment.internal.cup;

public class Cup {
    private String type;
    private int price;
    private String material;

    public Cup(String type, int price, String material) {
        this.type = type;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("CupHashCode:"+super.hashCode());
        return 87545;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Cup){
                System.out.println("have ref.will compare..");
                Cup cup1=this;
                Cup cup2=(Cup) obj;
                if(cup2.material.equals(cup1.material)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
