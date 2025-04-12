package com.xworkz.assignment.internal.doll;

public class Doll {
    private String name;
    private String material;
    private int height;

    public Doll(String name, String material, int height) {
        this.name = name;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Doll{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("DollHashCode:"+super.hashCode());
        return 421;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Doll){
                System.out.println("have ref.will compare..");
                Doll doll1=this;
                Doll doll2=(Doll) obj;
                if(doll1.height==doll2.height && doll1.name.equals(doll2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
