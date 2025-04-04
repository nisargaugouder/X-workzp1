package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.towel.Towel;
import com.xworkz.inheritence.internal.towel.BathTowel;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel();
        towel.absorb();
        towel.material();
        towel.size();
        towel.use();
        towel.wash();

        System.out.println("-----------");

        Towel towel2 = new BathTowel();
        towel2.absorb();
        towel2.material();
        towel2.size();
        towel2.use();
        towel2.wash();

        System.out.println("-----------");

        BathTowel bathTowel = new BathTowel();
        bathTowel.absorb();
        bathTowel.material();
        bathTowel.size();
        bathTowel.use();
        bathTowel.wash();
    }
}
