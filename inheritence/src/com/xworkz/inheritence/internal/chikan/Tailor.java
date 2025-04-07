package com.xworkz.inheritence.internal.chikan;

public class Tailor {

    public void checkQuality(Chikan chikan) {
        chikan.art();
        chikan.handMade();
        chikan.origin();
        chikan.design();
        chikan.fabric();

        if (chikan instanceof ChikanEmbroidery) {
            System.out.println("chikan instanceof ChikanEmbroidery");
            ChikanEmbroidery chikanEmbroidery = (ChikanEmbroidery) chikan;
            chikanEmbroidery.stitch();
        }
    }
}
