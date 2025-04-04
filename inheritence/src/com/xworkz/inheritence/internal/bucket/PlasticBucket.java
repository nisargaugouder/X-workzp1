package com.xworkz.inheritence.internal.bucket;

public class PlasticBucket extends Bucket {
    public PlasticBucket() {
        super();
        System.out.println("Running non-arg constructor PlasticBucket");
    }
    @Override
    public void store() {
        System.out.println("PlasticBucket is storing water efficiently--child");
    }
    @Override
    public void carry() {
        System.out.println("PlasticBucket is lightweight for carrying--child");
    }
    @Override
    public void fill() {
        System.out.println("PlasticBucket fills up quickly--child");
    }
    @Override
    public void empty() {
        System.out.println("PlasticBucket is easy to empty--child");
    }
    @Override
    public void clean() {
        System.out.println("PlasticBucket is easy to clean--child");
    }
}
