package com.xworkz.inheritence.internal.band;

public class Band {
    public Band() {
        System.out.println("Running non-arg constructor Band--parent");
    }
    public void bind() {
        System.out.println("Band is used for binding--parent");
    }
    public void stretch() {
        System.out.println("Band can stretch--parent");
    }
    public void size() {
        System.out.println("Band comes in different sizes--parent");
    }
    public void material() {
        System.out.println("Band is made of elastic material--parent");
    }
    public void use() {
        System.out.println("Band has many uses--parent");
    }
}
