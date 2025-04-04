package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.potato.Potato;
import com.xworkz.inheritence.internal.potato.SweetPotato;

public class PotatoRunner {
    public static void main(String[] args) {
        Potato potato = new SweetPotato();
        potato.grownUnderground();
        potato.usedInCooking();
        potato.containsCarbohydrates();
        potato.availableInVarieties();
        potato.stapleFood();

        System.out.println("-----------------");
        SweetPotato sweetPotato = new SweetPotato();
        sweetPotato.grownUnderground();
        sweetPotato.usedInCooking();
        sweetPotato.containsCarbohydrates();
        sweetPotato.availableInVarieties();
        sweetPotato.stapleFood();
    }
}
