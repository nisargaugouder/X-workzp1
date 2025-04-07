package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.church.Church;
import com.xworkz.inheritence.internal.church.CatholicChurch;
import com.xworkz.inheritence.internal.church.Father;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church1 = new Church();
        church1.service();
        church1.pray();
        church1.candles();
        church1.hymns();
        church1.bible();

        System.out.println("-----------------");
        Church church = new CatholicChurch();
        church.service();
        church.pray();
        church.candles();
        church.hymns();
        church.bible();

        System.out.println("-----------------");
        CatholicChurch catholicChurch = new CatholicChurch();
        catholicChurch.service();
        catholicChurch.pray();
        catholicChurch.candles();
        catholicChurch.hymns();
        catholicChurch.bible();

        System.out.println("---------- Father Class Calling ----------");
        Father father = new Father();
        father.conductPrayer(church);
        father.conductPrayer(church1);
        father.conductPrayer(catholicChurch);
    }
}
