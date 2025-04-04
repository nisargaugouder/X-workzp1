package com.xworkz.inheritence.internal.panipuri;

public class SpicyPanipuri extends Panipuri {
    public SpicyPanipuri() {
        super();
        System.out.println("SpicyPanipuri --child");
    }

    @Override
    public void street() {
        System.out.println("SpicyPanipuri is the best street snack --child");
    }

    @Override
    public void crispy() {
        System.out.println("SpicyPanipuri has extra crispy puris --child");
    }

    @Override
    public void variety() {
        System.out.println("SpicyPanipuri has tangy and spicy flavors --child");
    }

    @Override
    public void filling() {
        System.out.println("SpicyPanipuri has a fiery potato filling --child");
    }

    @Override
    public void fresh() {
        System.out.println("SpicyPanipuri tastes best when freshly served --child");
    }
}
