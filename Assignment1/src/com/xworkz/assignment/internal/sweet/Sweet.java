package com.xworkz.assignment.internal.sweet;

public class Sweet {
    private String name;
    private String origin;
    private boolean isSugarFree;

    public Sweet(String name, String origin, boolean isSugarFree) {
        this.name = name;
        this.origin = origin;
        this.isSugarFree = isSugarFree;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", isSugarFree=" + isSugarFree +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("SweetHashCode:"+super.hashCode());
        return 54;
    }
}
