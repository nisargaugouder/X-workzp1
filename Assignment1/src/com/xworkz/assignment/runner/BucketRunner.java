package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.bucket.Bucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(10, "Plastic", "Blue");
        System.out.println(bucket);
        System.out.println(bucket.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(bucket));
    }
}
