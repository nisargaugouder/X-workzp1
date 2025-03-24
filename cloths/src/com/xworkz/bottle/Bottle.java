package com.xworkz.bottle;

public class Bottle {
    public String shape;
    private int hold=1;
    boolean have=true;

    public void Shops(){
        shape="Cylinder";
        System.out.println("Bottle Shape i:"+this.shape);
        System.out.println("Bottle can hold:"+this.hold);
        System.out.println("Bottle have water:"+this.have);
    }
    private void Water(){
        System.out.println("Running Water in Bottle");
    }
    void Tank(){
        System.out.println("Running Tank in Bottle");
    }

}
