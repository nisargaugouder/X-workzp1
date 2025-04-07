package com.xworkz.inheritence.internal.appliance;

public class Fridge {
    public void open(Appliance appliance) {
        appliance.brand();
        appliance.consumeElectricity();
        appliance.function();
        appliance.powerOn();
        appliance.powerOff();

        if(appliance instanceof WashingMachine){
            System.out.println("appliance instanceof WashingMachine");
            WashingMachine washingMachine=(WashingMachine) appliance;
            washingMachine.size();
        }

    }
}