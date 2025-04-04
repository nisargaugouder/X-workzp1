package com.xworkz.inheritence.internal.continent;

public class Asia extends Continent {
    public Asia() {
        super();
        System.out.println("Running non-arg constructor Asia--child");
    }

    @Override
    public void countries() {
        System.out.println("Asia has countries like India and China--child");
    }

    @Override
    public void population() {
        System.out.println("Asia has the highest population--child");
    }

    @Override
    public void culture() {
        System.out.println("Asia has rich cultural diversity--child");
    }

    @Override
    public void economy() {
        System.out.println("Asia has strong growing economies--child");
    }

    @Override
    public void climate() {
        System.out.println("Asia has tropical and temperate climates--child");
    }
}
