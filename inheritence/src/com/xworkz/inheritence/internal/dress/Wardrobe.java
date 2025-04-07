package com.xworkz.inheritence.internal.dress;

public class Wardrobe {

    public void display(Dress dress) {
        dress.wear();
        dress.style();
        dress.gender();
        dress.comfort();
        dress.material();

        if(dress instanceof PartyDress) {
            System.out.println("dress instanceof PartyDress");
            PartyDress partyDress = (PartyDress) dress;
            partyDress.sparkle();
        }
    }
}
