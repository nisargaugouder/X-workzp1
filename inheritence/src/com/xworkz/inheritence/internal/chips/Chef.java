package com.xworkz.inheritence.internal.chips;

public class Chef {

    public void prepare(Chips chips) {
        chips.made();
        chips.crispy();
        chips.flavors();
        chips.packed();
        chips.snack();

        if (chips instanceof SpicyChips) {
            System.out.println("chips instanceof SpicyChips");
            SpicyChips spicyChips = (SpicyChips) chips;
            spicyChips.addSpice();
        }
    }
}
