
package com.xworkz.assignment.internal.clothing;

public class Clothing {
    private String type;
    private String size;
    private int price;

    public Clothing(String type, String size, int price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ClothingHashCode:"+super.hashCode());
        return 5263;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Clothing){
                System.out.println("have ref.will compare..");
                Clothing clothing1=this;
                Clothing clothing2=(Clothing) obj;
                if(clothing2.price==clothing2.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
