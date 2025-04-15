package com.xworkz.application.inherRunner;

import com.xworkz.application.inheritancetype.towel.Towel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel();
        towel.fold();
        towel.stretch();
        towel.absorb();
    }
}
