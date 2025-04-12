package com.xworkz.assignment.internal.ocean;

public class Ocean {
    private String name;
    private double area;
    private double depth;

    public Ocean(String name, double area, double depth) {
        this.name = name;
        this.area = area;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", area=" + area +
                " million sq km" +
                ", depth=" + depth +
                " meters" +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("OceanHashCode:"+super.hashCode());
        return 842;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof Ocean){
                System.out.println("obj instance of class");
                Ocean ocean1=this;
                Ocean ocean2=(Ocean) obj;
                if(ocean1.area==ocean2.area && ocean1.name.equals(ocean2.name) && ocean1.depth==ocean2.depth){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
