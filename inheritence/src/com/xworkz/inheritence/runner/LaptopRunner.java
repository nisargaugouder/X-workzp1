package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.laptop.Laptop;
import com.xworkz.inheritence.internal.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new GamingLaptop();
        laptop.runSoftware();
        laptop.providePortability();
        laptop.connectToInternet();
        laptop.supportMultitasking();
        laptop.longBatteryLife();

        System.out.println("-----------------");
        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.runSoftware();
        gamingLaptop.providePortability();
        gamingLaptop.connectToInternet();
        gamingLaptop.supportMultitasking();
        gamingLaptop.longBatteryLife();
    }
}
