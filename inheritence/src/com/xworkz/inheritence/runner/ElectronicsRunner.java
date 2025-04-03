package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.electronicDevice.ElectronicDevice;
import com.xworkz.inheritence.internal.electronicDevice.Mobile;

public class ElectronicsRunner {

        public static void main(String[] args) {
            ElectronicDevice device=new Mobile();
            device.powerOn();
            device.powerOff();
            device.battery();
            device.charge();

            System.out.println("-----------");
            Mobile mobile = new Mobile();
            mobile.powerOn();
            mobile.powerOff();
            mobile.battery();
            mobile.charge();
        }
    }



