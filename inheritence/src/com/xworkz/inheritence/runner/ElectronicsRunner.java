package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.electronicDevice.ElectronicDevice;
import com.xworkz.inheritence.internal.electronicDevice.Mobile;

public class ElectronicsRunner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice();
        device.powerOn();
        device.powerOff();
        device.battery();
        device.charge();
        device.connect();

        System.out.println("-----------");

        ElectronicDevice mobileDevice = new Mobile();
        mobileDevice.powerOn();
        mobileDevice.powerOff();
        mobileDevice.battery();
        mobileDevice.charge();
        mobileDevice.connect();

        System.out.println("-----------");

        Mobile mobile = new Mobile();
        mobile.powerOn();
        mobile.powerOff();
        mobile.battery();
        mobile.charge();
        mobile.connect();
    }
}
