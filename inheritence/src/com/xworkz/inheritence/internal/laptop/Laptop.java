package com.xworkz.inheritence.internal.laptop;

public class Laptop {
    public Laptop() {
        System.out.println("Laptop --parent");
    }

    public void runSoftware() {
        System.out.println("Laptop runs software --parent");
    }

    public void providePortability() {
        System.out.println("Laptop provides portability --parent");
    }

    public void connectToInternet() {
        System.out.println("Laptop connects to the internet --parent");
    }

    public void supportMultitasking() {
        System.out.println("Laptop supports multitasking --parent");
    }

    public void longBatteryLife() {
        System.out.println("Laptop has long battery life --parent");
    }
}
