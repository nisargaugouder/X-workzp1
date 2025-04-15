package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.charger.LaptopCharger;
import com.xworkz.application.inheritancetype.charger.PhoneCharger;

public class ChargerRunner {
    public static void main(String[] args) {
        PhoneCharger phoneCharger=new PhoneCharger();
        phoneCharger.fastCharge();
        phoneCharger.plugIn();
        LaptopCharger laptopCharger=new LaptopCharger();
        laptopCharger.heavyCharge();
        laptopCharger.plugIn();
    }
}
