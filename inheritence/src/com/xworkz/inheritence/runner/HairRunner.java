package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.hair.Black;
import com.xworkz.inheritence.internal.hair.Hair;
import com.xworkz.inheritence.internal.hair.CurlyHair;

public class HairRunner {
    public static void main(String[] args) {
        Hair hair = new Hair();
        hair.protect();
        hair.grow();
        hair.style();
        hair.maintain();
        hair.keratin();

        System.out.println("-----------");

        Hair hair2 = new CurlyHair();
        hair2.protect();
        hair2.grow();
        hair2.style();
        hair2.maintain();
        hair2.keratin();

        System.out.println("-----------");

        CurlyHair curlyHair = new CurlyHair();
        curlyHair.protect();
        curlyHair.grow();
        curlyHair.style();
        curlyHair.maintain();
        curlyHair.keratin();

        System.out.println("---------casting");
        Black black=new Black();
        black.cool(hair);
        black.cool(hair2);
        black.cool(curlyHair);
    }
}
