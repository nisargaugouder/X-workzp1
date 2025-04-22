package com.xworkz.late.internal.dead;

public class GhostImpl implements Dead {
    public GhostImpl() {
        System.out.println("no-arg const GhostImpl");
    }

    @Override
    public void silent() {
        System.out.println("silently haunting in GhostImpl");
    }
}
