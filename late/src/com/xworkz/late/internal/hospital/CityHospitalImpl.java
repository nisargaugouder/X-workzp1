package com.xworkz.late.internal.hospital;

public class CityHospitalImpl implements Hospital {
    public CityHospitalImpl() {
        System.out.println("no-arg const CityHospitalImpl");
    }

    @Override
    public void treat() {
        System.out.println("Treating in CityHospitalImpl");
    }
}
