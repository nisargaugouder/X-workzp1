package com.xworkz.inheritence.internal.hair;

public class Hair {
    public Hair() {
        System.out.println("Hair --parent");
    }

    public void protect() {
        System.out.println("Hair protects the scalp --parent");
    }

    public void grow() {
        System.out.println("Hair grows naturally --parent");
    }

    public void style() {
        System.out.println("Hair can be styled in many ways --parent");
    }

    public void maintain() {
        System.out.println("Hair requires regular maintenance --parent");
    }

    public void keratin() {
        System.out.println("Hair is made of keratin --parent");
    }
}
