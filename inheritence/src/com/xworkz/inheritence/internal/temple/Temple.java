package com.xworkz.inheritence.internal.temple;

public class Temple {
    public Temple() {
        System.out.println("Temple --parent");
    }

    public void worship() {
        System.out.println("People come to worship --parent");
    }

    public void meditate() {
        System.out.println("Temple provides a peaceful place for meditation --parent");
    }

    public void lightLamp() {
        System.out.println("Lamps are lit as a ritual --parent");
    }

    public void offerPrayers() {
        System.out.println("Prayers are offered to the deity --parent");
    }

    public void ringBell() {
        System.out.println("Bell is rung during rituals --parent");
    }
}
