package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bangles.Bangles;
import com.xworkz.inheritence.internal.bangles.GoldBangles;

public class BanglesRunner {
    public static void main(String[] args) {
        Bangles bangles = new GoldBangles();
        bangles.wornOnWrist();
        bangles.madeOfDifferentMaterials();
        bangles.traditionalJewelry();
        bangles.availableInVariousDesigns();
        bangles.symbolizeMaritalStatus();

        System.out.println("-----------------");
        GoldBangles goldBangles = new GoldBangles();
        goldBangles.wornOnWrist();
        goldBangles.madeOfDifferentMaterials();
        goldBangles.traditionalJewelry();
        goldBangles.availableInVariousDesigns();
        goldBangles.symbolizeMaritalStatus();
    }
}
