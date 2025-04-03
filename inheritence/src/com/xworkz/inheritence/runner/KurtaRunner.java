package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.kurta.Kurta;
import com.xworkz.inheritence.internal.kurta.SilkKurta;

public class KurtaRunner {
    public static void main(String[] args) {
        Kurta kurta = new SilkKurta();
        kurta.traditionalWear();
        kurta.comfortable();
        kurta.wornOnFestivals();
        kurta.comesInVariousDesigns();
        kurta.pairedWithPajama();

        System.out.println("-----------------");
        SilkKurta silkKurta = new SilkKurta();
        silkKurta.traditionalWear();
        silkKurta.comfortable();
        silkKurta.wornOnFestivals();
        silkKurta.comesInVariousDesigns();
        silkKurta.pairedWithPajama();
    }
}
