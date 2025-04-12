package com.xworkz.assignment.internal.panipuri;


public class Panipuri {
    private String filling;
    private String waterFlavor;
    private int quantity;

    public Panipuri(String filling, String waterFlavor, int quantity) {
        this.filling = filling;
        this.waterFlavor = waterFlavor;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Panipuri{" +
                "filling='" + filling + '\'' +
                ", waterFlavor='" + waterFlavor + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("PanipuriHashCode:"+super.hashCode());
        return 75;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Panipuri){
                System.out.println("obj instance of class");
                Panipuri panipuri1=this;
                Panipuri panipuri2=(Panipuri) obj;
                if(panipuri1.filling.equals(panipuri2.filling) && panipuri1.quantity==panipuri2.quantity && panipuri1.waterFlavor==panipuri2.waterFlavor){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
