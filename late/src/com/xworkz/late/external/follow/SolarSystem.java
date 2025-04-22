package com.xworkz.late.external.follow;

import com.xworkz.late.internal.pluto.Pluto;

public class SolarSystem {
    private Pluto pluto;

    public SolarSystem(Pluto pluto) {
        this.pluto = pluto;
    }

    public void revolve() {
        System.out.println("Running revolve in SolarSystem");
        if (this.pluto != null) {
            this.pluto.orbit();
        } else {
            System.out.println("error");
        }
    }
}
