package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bucket.Bucket;
import com.xworkz.inheritence.internal.bucket.PlasticBucket;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new PlasticBucket();
        bucket.storeWater();
        bucket.carry();
        bucket.clean();

        System.out.println("-----------------");
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.storeWater();
        plasticBucket.carry();
        plasticBucket.clean();
    }
}
