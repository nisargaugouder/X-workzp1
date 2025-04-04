package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.laptop.Laptop;
import com.xworkz.inheritence.internal.laptop.GamingLaptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.runSoftware();
        laptop.providePortability();
        laptop.connectToInternet();
        laptop.supportMultitasking();
        laptop.longBatteryLife();

        System.out.println("-----------");

        Laptop laptop2 = new GamingLaptop();
        laptop2.runSoftware();
        laptop2.providePortability();
        laptop2.connectToInternet();
        laptop2.supportMultitasking();
        laptop2.longBatteryLife();

        System.out.println("-----------");

        GamingLaptop gamingLaptop = new GamingLaptop();
        gamingLaptop.runSoftware();
        gamingLaptop.providePortability();
        gamingLaptop.connectToInternet();
        gamingLaptop.supportMultitasking();
        gamingLaptop.longBatteryLife();
    }
}
