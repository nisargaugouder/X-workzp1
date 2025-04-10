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
}
