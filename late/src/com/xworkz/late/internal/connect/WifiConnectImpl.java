package com.xworkz.late.internal.connect;

public class WifiConnectImpl implements Connect {
    public WifiConnectImpl() {
        System.out.println("no-arg const WifiConnectImpl");
    }

    @Override
    public void join() {
        System.out.println("joining network in WifiConnectImpl");
    }
}
