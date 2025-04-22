package com.xworkz.late.internal.fool;

public class ClownImpl implements Fool {
    public ClownImpl() {
        System.out.println("no-arg const ClownImpl");
    }

    @Override
    public void laugh() {
        System.out.println("ClownImpl is laughing");
    }
}
