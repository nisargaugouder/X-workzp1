package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.electronicdevice.ElectronicDevice;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice("Laptop", "Dell", 2);
        System.out.println(device);
    }
}
