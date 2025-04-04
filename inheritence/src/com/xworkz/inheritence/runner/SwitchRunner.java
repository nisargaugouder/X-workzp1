package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.switchs.Switch;
import com.xworkz.inheritence.internal.switchs.ElectricSwitch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch sw = new Switch();
        sw.turnOn();
        sw.turnOff();
        sw.saveElectricity();
        sw.designs();
        sw.usage();

        System.out.println("-----------");

        Switch sw2 = new ElectricSwitch();
        sw2.turnOn();
        sw2.turnOff();
        sw2.saveElectricity();
        sw2.designs();
        sw2.usage();

        System.out.println("-----------");

        ElectricSwitch electricSwitch = new ElectricSwitch();
        electricSwitch.turnOn();
        electricSwitch.turnOff();
        electricSwitch.saveElectricity();
        electricSwitch.designs();
        electricSwitch.usage();
    }
}
