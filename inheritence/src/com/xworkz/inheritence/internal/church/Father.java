package com.xworkz.inheritence.internal.church;

public class Father {

    public void conductPrayer(Church church) {
        church.service();
        church.pray();
        church.candles();
        church.hymns();
        church.bible();

        if (church instanceof CatholicChurch) {
            System.out.println("church instanceof CatholicChurch");
            CatholicChurch catholicChurch = (CatholicChurch) church;
            catholicChurch.specialEvent();
        }
    }
}
