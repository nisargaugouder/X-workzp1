package com.xworkz.inheritence.internal.clothing;

public class ClothShop {

    public void purchase(Clothing clothing) {
        clothing.wear();
        clothing.fabric();
        clothing.fit();
        clothing.label();
        clothing.style();

        if(clothing instanceof TShirt) {
            System.out.println("clothing instanceof TShirt");
            TShirt tShirt = (TShirt) clothing;
            tShirt.brand();
        }
    }
}
