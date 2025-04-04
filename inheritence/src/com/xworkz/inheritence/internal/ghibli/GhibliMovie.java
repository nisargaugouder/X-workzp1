package com.xworkz.inheritence.internal.ghibli;

public class GhibliMovie extends Ghibli {
    public GhibliMovie() {
        super();
        System.out.println("GhibliMovie --child");
    }

    @Override
    public void animate() {
        System.out.println("GhibliMovie uses hand-drawn animation --child");
    }

    @Override
    public void story() {
        System.out.println("GhibliMovie stories have deep meanings --child");
    }

    @Override
    public void inspire() {
        System.out.println("GhibliMovie characters inspire audiences --child");
    }

    @Override
    public void fantasy() {
        System.out.println("GhibliMovie blends reality with fantasy --child");
    }

    @Override
    public void nature() {
        System.out.println("GhibliMovie highlights nature’s beauty --child");
    }
}
