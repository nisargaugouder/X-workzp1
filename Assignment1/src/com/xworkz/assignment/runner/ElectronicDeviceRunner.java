package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.electronicdevice.ElectronicDevice;

public class ElectronicDeviceRunner {
    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice("Laptop", "Dell", 2);
        System.out.println(device);
        System.out.println(device.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(device));

        ElectronicDevice device1 = new ElectronicDevice("Laptop", "Dell", 2);
        ElectronicDevice device2 = new ElectronicDevice("Smartphone", "Samsung", 1);

        boolean same = device1.equals(device2);
        System.out.println("same:" + same);
    }
}
