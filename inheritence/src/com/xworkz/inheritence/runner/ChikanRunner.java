package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.chikan.Chikan;
import com.xworkz.inheritence.internal.chikan.ChikanEmbroidery;
import com.xworkz.inheritence.internal.chikan.Tailor;

public class ChikanRunner {
    public static void main(String[] args) {
        Chikan chikan1 = new Chikan();
        chikan1.art();
        chikan1.handMade();
        chikan1.origin();
        chikan1.design();
        chikan1.fabric();

        System.out.println("-------------------");
        Chikan chikan = new ChikanEmbroidery();
        chikan.art();
        chikan.handMade();
        chikan.origin();
        chikan.design();
        chikan.fabric();

        System.out.println("-----------------");
        ChikanEmbroidery chikanEmbroidery = new ChikanEmbroidery();
        chikanEmbroidery.art();
        chikanEmbroidery.handMade();
        chikanEmbroidery.origin();
        chikanEmbroidery.design();
        chikanEmbroidery.fabric();

        System.out.println("---------- Tailor Class Calling ----------");
        Tailor tailor = new Tailor();
        tailor.checkQuality(chikan);
        tailor.checkQuality(chikan1);
        tailor.checkQuality(chikanEmbroidery);
    }
}
