package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.netflix.Netflix;
import com.xworkz.inheritence.internal.netflix.NetflixSeries;

public class NetflixRunner {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();
        netflix.stream();
        netflix.subscribe();
        netflix.devices();
        netflix.content();
        netflix.offline();

        System.out.println("-----------");

        Netflix netflix2 = new NetflixSeries();
        netflix2.stream();
        netflix2.subscribe();
        netflix2.devices();
        netflix2.content();
        netflix2.offline();

        System.out.println("-----------");

        NetflixSeries netflixSeries = new NetflixSeries();
        netflixSeries.stream();
        netflixSeries.subscribe();
        netflixSeries.devices();
        netflixSeries.content();
        netflixSeries.offline();
    }
}
