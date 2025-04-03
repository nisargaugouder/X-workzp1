package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.dress.Dress;
import com.xworkz.inheritence.internal.dress.PartyDress;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress = new PartyDress();
        dress.wear();
        dress.comesInDifferentStyles();
        dress.availableForAllGenders();
        dress.providesComfort();
        dress.madeOfVariousMaterials();

        System.out.println("-----------------");
        PartyDress partyDress = new PartyDress();
        partyDress.wear();
        partyDress.comesInDifferentStyles();
        partyDress.availableForAllGenders();
        partyDress.providesComfort();
        partyDress.madeOfVariousMaterials();
    }
}
