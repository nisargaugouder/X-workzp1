package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.church.Church;
import com.xworkz.inheritence.internal.church.CatholicChurch;

public class ChurchRunner {
    public static void main(String[] args) {
        Church church = new CatholicChurch();
        church.attendService();
        church.pray();
        church.lightCandles();
        church.singHymns();
        church.readBible();

        System.out.println("-----------------");
        CatholicChurch catholicChurch = new CatholicChurch();
        catholicChurch.attendService();
        catholicChurch.pray();
        catholicChurch.lightCandles();
        catholicChurch.singHymns();
        catholicChurch.readBible();
    }
}
