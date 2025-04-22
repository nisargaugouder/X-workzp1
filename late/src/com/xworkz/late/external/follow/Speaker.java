package com.xworkz.late.external.follow;

import com.xworkz.late.internal.bluetooth.Bluetooth;

public class Speaker {
    private Bluetooth bluetooth;

    public Speaker(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public void playMusic() {
        System.out.println("Running playMusic in Speaker");
        if (this.bluetooth != null) {
            this.bluetooth.connect();
        } else {
            System.out.println("Error: bluetooth is null");
        }
    }
}
