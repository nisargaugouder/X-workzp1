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

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public int hashCode() {
        System.out.println("earpodsHashCode:"+super.hashCode());
        return 41;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Earpods){
                System.out.println("have ref.will compare..");
                Earpods earpods1=this;
                Earpods earpods2=(Earpods) obj;
                if(earpods1.isWireless==earpods2.isWireless && earpods1.batteryLife==earpods2.batteryLife){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
