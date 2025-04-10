package com.xworkz.assignment.internal.earpods;

public class Earpods {
    private String brand;
    private boolean isWireless;
    private int batteryLife;

    public Earpods(String brand, boolean isWireless, int batteryLife) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Earpods{" +
                "brand='" + brand + '\'' +
                ", isWireless=" + isWireless +
                ", batteryLife=" + batteryLife +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("earpodsHashCode:"+super.hashCode());
        return 41;
    }
}
