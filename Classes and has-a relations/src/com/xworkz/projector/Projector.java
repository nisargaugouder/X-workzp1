package com.xworkz.projector;

import java.awt.*;

public class Projector {
    public static void main(String[] args) {
        Lens lens=new Lens(50);
        Lamp lamp=new Lamp("trip",new Warranty("20/1/0","4/2/2025"));
        Port port=new Port("ton",5);
        Wire wire=new Wire("brazil",200,new Quality("zoom",5));
        Board board=new Board("scate",5,new Capacitor(420));
        Button button=new Button("Blue",true);
        Remote remote=new Remote("Infosys","Red",new Battery(99,new Voltage(20,"Wat")));


    }
}
