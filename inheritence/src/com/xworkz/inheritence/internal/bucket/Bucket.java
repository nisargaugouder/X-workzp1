package com.xworkz.inheritence.internal.bucket;

public class Bucket {
    public Bucket() {
        System.out.println("Running non-arg constructor Bucket");
    }
    public void storeWater() {
        System.out.println("Bucket is storing water");
    }
    public void carry() {
        System.out.println("Bucket is used for carrying liquid");
    }
    public void clean() {
        System.out.println("Bucket is being cleaned");
    }
}
