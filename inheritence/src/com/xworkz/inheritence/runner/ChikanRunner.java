package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.chikan.Chikan;
import com.xworkz.inheritence.internal.chikan.ChikanEmbroidery;

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
    }
}
