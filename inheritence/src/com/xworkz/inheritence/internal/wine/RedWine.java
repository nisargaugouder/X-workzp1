package com.xworkz.inheritence.internal.wine;

public class RedWine extends Wine {
    public RedWine() {
        super();
        System.out.println("RedWine --child");
    }

    @Override
    public void grapes() {
        System.out.println("Red wine is made from dark grapes --child");
    }

    @Override
    public void alcohol() {
        System.out.println("Red wine has varying alcohol content --child");
    }

    @Override
    public void aging() {
        System.out.println("Red wine gets better with aging --child");
    }

    @Override
    public void serve() {
        System.out.println("Red wine is served at room temperature --child");
    }

    @Override
    public void cooking() {
        System.out.println("Red wine is used in rich sauces --child");
    }
}
