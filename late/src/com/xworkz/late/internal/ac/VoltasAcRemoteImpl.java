package com.xworkz.late.internal.ac;

public class VoltasAcRemoteImpl implements AcRemote {
    public VoltasAcRemoteImpl(){
        System.out.println("no-arg const of VoltasAcRemoteImpl");
    }

    @Override
    public void cool() {
        System.out.println("Cooling room using Voltas AC");
    }
}
