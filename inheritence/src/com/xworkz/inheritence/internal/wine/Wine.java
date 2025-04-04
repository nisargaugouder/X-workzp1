package com.xworkz.inheritence.internal.wine;

public class Wine {
    public Wine() {
        System.out.println("Wine --parent");
    }

    public void grapes() {
        System.out.println("Wine is made from grapes --parent");
    }

    public void alcohol() {
        System.out.println("Wine contains alcohol --parent");
    }

    public void aging() {
        System.out.println("Wine improves with age --parent");
    }

    public void serve() {
        System.out.println("Wine is served in glasses --parent");
    }

    public void cooking() {
        System.out.println("Wine is used in cooking --parent");
    }
}
