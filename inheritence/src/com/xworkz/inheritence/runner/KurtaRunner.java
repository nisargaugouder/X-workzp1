package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.kurta.Kurta;
import com.xworkz.inheritence.internal.kurta.SilkKurta;

public class KurtaRunner {
    public static void main(String[] args) {
        Kurta kurta = new Kurta();
        kurta.traditional();
        kurta.comfort();
        kurta.festivalWear();
        kurta.design();
        kurta.pairWithPajama();

        System.out.println("-----------");

        Kurta kurta2 = new SilkKurta();
        kurta2.traditional();
        kurta2.comfort();
        kurta2.festivalWear();
        kurta2.design();
        kurta2.pairWithPajama();

        System.out.println("-----------");

        SilkKurta silkKurta = new SilkKurta();
        silkKurta.traditional();
        silkKurta.comfort();
        silkKurta.festivalWear();
        silkKurta.design();
        silkKurta.pairWithPajama();
    }
}
