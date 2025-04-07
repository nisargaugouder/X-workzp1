package com.xworkz.inheritence.internal.kurta;

public class Collection {
    public void india(Kurta kurta){
        kurta.comfort();
        kurta.design();
        kurta.festivalWear();
        kurta.pairWithPajama();
        kurta.traditional();

        if(kurta instanceof SilkKurta){
            SilkKurta silkKurta=(SilkKurta) kurta;
            silkKurta.pair();
        }
    }
}
