package com.xworkz.inheritence.internal.language;

public class Java extends Language {
    public Java() {
        super();
        System.out.println("Java --child");
    }

    @Override
    public void speak() {
        System.out.println("Java is not spoken --child");
    }

    @Override
    public void write() {
        System.out.println("Java is written in code --child");
    }

    @Override
    public void communicate() {
        System.out.println("Java helps in software communication --child");
    }

    @Override
    public void grammar() {
        System.out.println("Java follows strict syntax rules --child");
    }

    @Override
    public void origin() {
        System.out.println("Java originated in 1995 --child");
    }

    public void difficult(){
        System.out.println("new method");
    }
}
