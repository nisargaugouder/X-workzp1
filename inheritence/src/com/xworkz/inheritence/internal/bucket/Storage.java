package com.xworkz.inheritence.internal.bucket;

public class Storage {

    public void use(Bucket bucket) {
        bucket.store();
        bucket.carry();
        bucket.fill();
        bucket.empty();
        bucket.clean();

        if(bucket instanceof PlasticBucket) {
            PlasticBucket plasticBucket = (PlasticBucket) bucket;
            plasticBucket.durability();
        }
    }
}
