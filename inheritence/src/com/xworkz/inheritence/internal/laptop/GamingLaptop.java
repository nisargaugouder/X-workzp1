package com.xworkz.inheritence.internal.laptop;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        super();
        System.out.println("GamingLaptop --child");
    }

    @Override
    public void runSoftware() {
        System.out.println("GamingLaptop runs high-end games --child");
    }

    @Override
    public void providePortability() {
        System.out.println("GamingLaptop is bulkier but portable --child");
    }

    @Override
    public void connectToInternet() {
        System.out.println("GamingLaptop has high-speed connectivity --child");
    }

    @Override
    public void supportMultitasking() {
        System.out.println("GamingLaptop supports intense multitasking --child");
    }

    @Override
    public void longBatteryLife() {
        System.out.println("GamingLaptop consumes more power --child");
    }
}
