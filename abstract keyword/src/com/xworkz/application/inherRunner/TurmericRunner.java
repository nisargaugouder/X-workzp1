package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.turmeric.TurmericPowder;
import com.xworkz.application.inheritancetype.turmeric.TurmericPaste;

public class TurmericRunner {
    public static void main(String[] args) {
        TurmericPowder powder = new TurmericPowder();
        powder.useForCooking();
        powder.heal();

        TurmericPaste paste = new TurmericPaste();
        paste.applyForSkin();
        paste.heal();
    }
}
