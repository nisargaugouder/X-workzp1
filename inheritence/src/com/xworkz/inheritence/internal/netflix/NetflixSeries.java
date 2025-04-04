package com.xworkz.inheritence.internal.netflix;

public class NetflixSeries extends Netflix {
    public NetflixSeries() {
        super();
        System.out.println("NetflixSeries --child");
    }

    @Override
    public void stream() {
        System.out.println("NetflixSeries offers high-quality streaming --child");
    }

    @Override
    public void subscribe() {
        System.out.println("NetflixSeries requires a subscription --child");
    }

    @Override
    public void devices() {
        System.out.println("NetflixSeries can be watched on smart TVs --child");
    }

    @Override
    public void content() {
        System.out.println("NetflixSeries includes exclusive originals --child");
    }

    @Override
    public void offline() {
        System.out.println("NetflixSeries supports offline downloads --child");
    }
}
