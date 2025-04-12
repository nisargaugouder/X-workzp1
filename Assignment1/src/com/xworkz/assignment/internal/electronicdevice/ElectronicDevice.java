package com.xworkz.assignment.internal.electronicdevice;

public class ElectronicDevice {
    private String name;
    private String brand;
    private int warrantyPeriod;

    public ElectronicDevice(String name, String brand, int warrantyPeriod) {
        this.name = name;
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        System.out.println("ElectronicHashCode:"+super.hashCode());
        return 54;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof ElectronicDevice){
                System.out.println("have ref.will compare..");
                ElectronicDevice electronicDevice1=this;
                ElectronicDevice electronicDevice2=(ElectronicDevice) obj;
                if(electronicDevice1.brand.equals(electronicDevice2.brand) && electronicDevice1.name.equals(electronicDevice2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
