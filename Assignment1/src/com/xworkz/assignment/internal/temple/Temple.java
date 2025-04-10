package com.xworkz.assignment.internal.temple;

public class Temple {
    private String name;
    private String location;
    private int yearEstablished;

    public Temple(String name, String location, int yearEstablished) {
        this.name = name;
        this.location = location;
        this.yearEstablished = yearEstablished;
    }

    @Override
    public String toString() {
        return "Temple{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", yearEstablished=" + yearEstablished +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("templeHashCode:"+super.hashCode());
        return 841;
    }
}
