package com.xworkz.inheritence.internal.river;

public class River {
    public River() {
        System.out.println("River --parent");
    }

    public void length() {
        System.out.println("River has a long stretch --parent");
    }

    public void origin() {
        System.out.println("River starts from a source --parent");
    }

    public void flows() {
        System.out.println("River flows continuously --parent");
    }

    public void providesWater() {
        System.out.println("River provides water --parent");
    }

    public void wildlife() {
        System.out.println("River supports wildlife --parent");
    }
}
