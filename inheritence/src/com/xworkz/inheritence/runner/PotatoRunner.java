package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.potato.Potato;
import com.xworkz.inheritence.internal.potato.SweetPotato;

public class PotatoRunner {
    public static void main(String[] args) {
        Potato potato = new Potato();
        potato.grow();
        potato.cook();
        potato.carbs();
        potato.types();
        potato.staple();

        System.out.println("-----------");

        Potato potato2 = new SweetPotato();
        potato2.grow();
        potato2.cook();
        potato2.carbs();
        potato2.types();
        potato2.staple();

        System.out.println("-----------");

        SweetPotato sweetPotato = new SweetPotato();
        sweetPotato.grow();
        sweetPotato.cook();
        sweetPotato.carbs();
        sweetPotato.types();
        sweetPotato.staple();
    }
}
