package com.xworkz.inheritence.internal.bucket;

public class PlasticBucket extends Bucket {

    public PlasticBucket() {
        super();
        System.out.println("Running no-arg constructor of PlasticBucket -- Child Class");
    }

    @Override
    public void store() {
        System.out.println("Storing water in PlasticBucket -- Child Class");
    }

    @Override
    public void carry() {
        System.out.println("Carrying PlasticBucket -- Child Class");
    }

    @Override
    public void fill() {
        System.out.println("Filling the PlasticBucket -- Child Class");
    }

    @Override
    public void empty() {
        System.out.println("Emptying the PlasticBucket -- Child Class");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the PlasticBucket -- Child Class");
    }

    public void durability() {
        System.out.println("PlasticBucket is durable -- Extra Method in Child Class");
    }
}
