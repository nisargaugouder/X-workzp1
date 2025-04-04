package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.clothing.Clothing;
import com.xworkz.inheritence.internal.clothing.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing1 = new Clothing();
        clothing1.wear();
        clothing1.fabric();
        clothing1.fit();
        clothing1.label();
        clothing1.style();

        System.out.println("-----------");

        Clothing clothing = new TShirt();
        clothing.wear();
        clothing.fabric();
        clothing.fit();
        clothing.label();
        clothing.style();

        System.out.println("-----------");

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.fabric();
        tShirt.fit();
        tShirt.label();
        tShirt.style();
    }
}
