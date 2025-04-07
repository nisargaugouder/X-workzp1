package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.bucket.Bucket;
import com.xworkz.inheritence.internal.bucket.PlasticBucket;
import com.xworkz.inheritence.internal.bucket.Storage;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket1 = new Bucket();
        bucket1.store();
        bucket1.carry();
        bucket1.fill();
        bucket1.empty();
        bucket1.clean();

        System.out.println("-------------------");
        Bucket bucket = new PlasticBucket();
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        System.out.println("-------------------");
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.store();
        plasticBucket.carry();
        plasticBucket.fill();
        plasticBucket.empty();
        plasticBucket.clean();

        System.out.println("-------casting example------------");
        Storage storage = new Storage();
        storage.use(bucket);
        storage.use(bucket1);
        storage.use(plasticBucket);
    }
}
