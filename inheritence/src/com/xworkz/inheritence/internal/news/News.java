package com.xworkz.inheritence.internal.news;

public class News {
    public News() {
        System.out.println("News --parent");
    }

    public void report() {
        System.out.println("News reports daily updates --parent");
    }

    public void broadcast() {
        System.out.println("News is broadcast on TV and radio --parent");
    }

    public void publish() {
        System.out.println("News is published in newspapers --parent");
    }

    public void politics() {
        System.out.println("News covers political affairs --parent");
    }

    public void sports() {
        System.out.println("News covers sports events --parent");
    }
}
