package com.xworkz.inheritence.internal.continent;

public class Asia extends Continent {

    @Override
    public void countries() {
        System.out.println("Running countries in Asia");
    }

    @Override
    public void population() {
        System.out.println("Running population in Asia");
    }

    @Override
    public void culture() {
        System.out.println("Running culture in Asia");
    }

    @Override
    public void economy() {
        System.out.println("Running economy in Asia");
    }

    @Override
    public void climate() {
        System.out.println("Running climate in Asia");
    }

    public void famousFor() {
        System.out.println("Asia is famous for its diversity");
    }
}
