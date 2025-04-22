package com.xworkz.late.internal.medical;

public class FirstAidImpl implements Medical {
    public FirstAidImpl() {
        System.out.println("no-arg const FirstAidImpl");
    }

    @Override
    public void heal() {
        System.out.println("FirstAidImpl is healing");
    }
}
