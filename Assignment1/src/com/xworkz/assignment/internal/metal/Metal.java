package com.xworkz.assignment.internal.metal;

public class Metal {
    private String name;
    private String type;
    private int price;

    public Metal(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Metal{name='" + name + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("MetalHashCode:"+super.hashCode());
        return 822;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Metal){
                System.out.println("have ref.will compare..");
                Metal metal1=this;
                Metal metal2=(Metal) obj;
                if(metal1.name.equals(metal2.name) && metal2.type.equals(metal2.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
