package com.xworkz.inheritence.internal.photo;

public class Photo {
    public Photo() {
        System.out.println("Photo --parent");
    }

    public void capture() {
        System.out.println("Photo captures moments --parent");
    }

    public void store() {
        System.out.println("Photo is stored in albums --parent");
    }

    public void print() {
        System.out.println("Photo can be printed on paper --parent");
    }

    public void format() {
        System.out.println("Photo is available in different formats --parent");
    }

    public void share() {
        System.out.println("Photo can be shared with others --parent");
    }
}
