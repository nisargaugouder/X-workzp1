package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bangles.Bangles;
import com.xworkz.inheritence.internal.bangles.GoldBangles;

public class BanglesRunner {
    public static void main(String[] args) {
        Bangles bangles1 = new Bangles();
        bangles1.wear();
        bangles1.material();
        bangles1.tradition();
        bangles1.design();
        bangles1.symbol();

        System.out.println("-------------------");
        Bangles bangles = new GoldBangles();
        bangles.wear();
        bangles.material();
        bangles.tradition();
        bangles.design();
        bangles.symbol();

        System.out.println("-----------------");
        GoldBangles goldBangles = new GoldBangles();
        goldBangles.wear();
        goldBangles.material();
        goldBangles.tradition();
        goldBangles.design();
        goldBangles.symbol();
    }
}
