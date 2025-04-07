package com.xworkz.inheritence.internal.bangles;

public class Circle {
    public void round(Bangles bangles){
        bangles.design();
        bangles.material();
        bangles.symbol();
        bangles.wear();
        bangles.tradition();

        if(bangles instanceof GoldBangles){
            System.out.println("bangles instanceof GoldBangles");
            GoldBangles goldBangles=(GoldBangles) bangles;
            goldBangles.cost();
        }
    }
}
