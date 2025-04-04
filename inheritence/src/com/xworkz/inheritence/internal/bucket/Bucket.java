package com.xworkz.inheritence.internal.bucket;

public class Bucket {
    public Bucket() {
        System.out.println("Running non-arg constructor Bucket--parent");
    }
    public void store() {
        System.out.println("Bucket is storing water--parent");
    }
    public void carry() {
        System.out.println("Bucket is used for carrying liquid--parent");
    }
    public void fill() {
        System.out.println("Bucket is being filled with water--parent");
    }
    public void empty() {
        System.out.println("Bucket is being emptied--parent");
    }
    public void clean() {
        System.out.println("Bucket is being cleaned--parent");
    }
}
