package com.xworkz.assignment.internal.cover;

public class Cover {
    private String type;
    private String material;
    private int price;

    public Cover(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("CoverHashCode:"+super.hashCode());
        return 623;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Cover){
                System.out.println("have ref.will compare..");
                Cover cover1=this;
                Cover cover2=(Cover) obj;
                if(cover2.price==cover1.price){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
