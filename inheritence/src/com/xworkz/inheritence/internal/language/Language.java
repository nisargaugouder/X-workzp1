package com.xworkz.inheritence.internal.language;

public class Language {
    public Language() {
        System.out.println("Language --parent");
    }

    public void speak() {
        System.out.println("Language is spoken --parent");
    }

    public void write() {
        System.out.println("Language is written --parent");
    }

    public void communicate() {
        System.out.println("Language helps in communication --parent");
    }

    public void grammar() {
        System.out.println("Language has grammar rules --parent");
    }

    public void origin() {
        System.out.println("Language has an origin --parent");
    }
}
