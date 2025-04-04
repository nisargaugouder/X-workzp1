package com.xworkz.inheritence.internal.sugar;

public class BrownSugar extends Sugar {
    public BrownSugar() {
        super();
        System.out.println("BrownSugar --child");
    }

    @Override
    public void sweeten() {
        System.out.println("BrownSugar has a mild sweetness --child");
    }

    @Override
    public void dissolve() {
        System.out.println("BrownSugar dissolves slower than white sugar --child");
    }

    @Override
    public void store() {
        System.out.println("BrownSugar should be stored in airtight containers --child");
    }

    @Override
    public void addToDesserts() {
        System.out.println("BrownSugar adds caramel flavor to desserts --child");
    }

    @Override
    public void usedInBaking() {
        System.out.println("BrownSugar is often used in baking cookies --child");
    }
}
