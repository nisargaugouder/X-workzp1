package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.chips.Chips;
import com.xworkz.inheritence.internal.chips.SpicyChips;

public class ChipsRunner {
    public static void main(String[] args) {
        Chips chips = new SpicyChips();
        chips.madeFromPotato();
        chips.crispyTexture();
        chips.availableInFlavors();
        chips.packedForSale();
        chips.commonlySnacked();

        System.out.println("-----------------");
        SpicyChips spicyChips = new SpicyChips();
        spicyChips.madeFromPotato();
        spicyChips.crispyTexture();
        spicyChips.availableInFlavors();
        spicyChips.packedForSale();
        spicyChips.commonlySnacked();
    }
}
