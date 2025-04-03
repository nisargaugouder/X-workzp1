package com.xworkz.inheritence.internal.electronicDevice;

public class ElectronicDevice {
        public ElectronicDevice() {
            System.out.println("Running non-arg constructor of ElectronicDevice");
        }
        public void powerOn() {
            System.out.println("Electronic device is powered on");
        }
        public void powerOff() {
            System.out.println("Electronic device is powered off");
        }
        public void battery() {
            System.out.println("Electronic device has a battery");
        }
        public void charge() {
            System.out.println("Electronic device is charging");
        }


}
