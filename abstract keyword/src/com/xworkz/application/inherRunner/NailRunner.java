package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.nail.NailPolish;
import com.xworkz.application.inheritancetype.nail.NailArt;

public class NailRunner {
    public static void main(String[] args) {
        NailPolish polish = new NailPolish();
        polish.decorate();
        polish.fixObject();

        NailArt art = new NailArt();
        art.design();
        art.fixObject();
    }
}
