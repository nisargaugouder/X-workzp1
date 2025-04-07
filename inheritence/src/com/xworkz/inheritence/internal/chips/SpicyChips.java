package com.xworkz.inheritence.internal.chips;

public class SpicyChips extends Chips {

    public SpicyChips() {
        super();
        System.out.println("Running non-arg constructor SpicyChips--child");
    }

    @Override
    public void made() {
        System.out.println("Chips made from potato--child");
    }

    @Override
    public void crispy() {
        System.out.println("Chips are crispy--child");
    }

    @Override
    public void flavors() {
        System.out.println("Chips come in flavors--child");
    }

    @Override
    public void packed() {
        System.out.println("Chips are packed for sale--child");
    }

    @Override
    public void snack() {
        System.out.println("Chips are a common snack--child");
    }

    public void addSpice() {
        System.out.println("Extra spices added in SpicyChips--child");
    }
}
