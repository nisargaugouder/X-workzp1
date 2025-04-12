package com.xworkz.assignment.internal.charger;

public class Charger {
    private String brand;
    private int outputVoltage;
    private boolean isFastCharging;

    public Charger(String brand, int outputVoltage, boolean isFastCharging) {
        this.brand = brand;
        this.outputVoltage = outputVoltage;
        this.isFastCharging = isFastCharging;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "brand='" + brand + '\'' +
                ", outputVoltage=" + outputVoltage +
                ", isFastCharging=" + isFastCharging +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ChargerHashCode:"+super.hashCode());
        return 76;
    }

    public void setOutputVoltage(int outputVoltage) {
        this.outputVoltage = outputVoltage;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Charger){
                System.out.println("have ref.will compare..");
                Charger charger1=this;
                Charger charger2=(Charger) obj;
                if(charger1.outputVoltage==charger2.outputVoltage){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
