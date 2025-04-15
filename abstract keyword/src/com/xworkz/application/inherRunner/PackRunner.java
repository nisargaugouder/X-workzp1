package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.pack.GiftPack;
import com.xworkz.application.inheritancetype.pack.TravelPack;

public class PackRunner {
    public static void main(String[] args) {
        GiftPack giftPack = new GiftPack();
        giftPack.addGiftTag();
        giftPack.wrap();

        TravelPack travelPack = new TravelPack();
        travelPack.carryEssentials();
        travelPack.wrap();
    }
}
