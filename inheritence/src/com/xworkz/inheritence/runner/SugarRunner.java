package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.sugar.Sugar;
import com.xworkz.inheritence.internal.sugar.BrownSugar;

public class SugarRunner {
    public static void main(String[] args) {
        Sugar sugar = new Sugar();
        sugar.sweeten();
        sugar.dissolve();
        sugar.store();
        sugar.addToDesserts();
        sugar.usedInBaking();

        System.out.println("-----------");

        Sugar sugar2 = new BrownSugar();
        sugar2.sweeten();
        sugar2.dissolve();
        sugar2.store();
        sugar2.addToDesserts();
        sugar2.usedInBaking();

        System.out.println("-----------");

        BrownSugar brownSugar = new BrownSugar();
        brownSugar.sweeten();
        brownSugar.dissolve();
        brownSugar.store();
        brownSugar.addToDesserts();
        brownSugar.usedInBaking();
    }
}
