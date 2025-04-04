package com.xworkz.inheritence.internal.news;

public class BreakingNews extends News {
    public BreakingNews() {
        super();
        System.out.println("BreakingNews --child");
    }

    @Override
    public void report() {
        System.out.println("BreakingNews provides instant updates --child");
    }

    @Override
    public void broadcast() {
        System.out.println("BreakingNews is aired immediately --child");
    }

    @Override
    public void publish() {
        System.out.println("BreakingNews is posted online quickly --child");
    }

    @Override
    public void politics() {
        System.out.println("BreakingNews covers major political issues --child");
    }

    @Override
    public void sports() {
        System.out.println("BreakingNews highlights live sports scores --child");
    }
}
