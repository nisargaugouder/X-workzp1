package com.xworkz.late.internal.bluetooth;

public class BluetoothImpl implements Bluetooth {
    public BluetoothImpl() {
        System.out.println("no-arg constructor of BluetoothImpl");
    }

    @Override
    public void connect() {
        System.out.println("Connecting via Bluetooth");
    }
}
