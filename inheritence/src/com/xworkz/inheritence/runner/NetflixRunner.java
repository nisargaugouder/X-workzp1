package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.netflix.Netflix;
import com.xworkz.inheritence.internal.netflix.NetflixSeries;

public class NetflixRunner {
    public static void main(String[] args) {
        Netflix netflix = new NetflixSeries();
        netflix.streamShows();
        netflix.offerSubscription();
        netflix.supportMultipleDevices();
        netflix.provideOriginalContent();
        netflix.allowOfflineViewing();

        System.out.println("-----------------");
        NetflixSeries netflixSeries = new NetflixSeries();
        netflixSeries.streamShows();
        netflixSeries.offerSubscription();
        netflixSeries.supportMultipleDevices();
        netflixSeries.provideOriginalContent();
        netflixSeries.allowOfflineViewing();
    }
}
