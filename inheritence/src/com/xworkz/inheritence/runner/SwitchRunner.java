package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.switchs.ElectricSwitch;
import com.xworkz.inheritence.internal.switchs.Switch;

public class SwitchRunner {
    public static void main(String[] args) {
        Switch sw = new ElectricSwitch();
        sw.turnOn();
        sw.turnOff();
        sw.saveElectricity();
        sw.availableInVariousDesigns();
        sw.usedInHomes();

        System.out.println("-----------------");
        ElectricSwitch electricSwitch = new ElectricSwitch();
        electricSwitch.turnOn();
        electricSwitch.turnOff();
        electricSwitch.saveElectricity();
        electricSwitch.availableInVariousDesigns();
        electricSwitch.usedInHomes();
    }
}
