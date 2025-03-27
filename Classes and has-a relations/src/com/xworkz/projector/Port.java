package com.xworkz.projector;

public class Port {
    private String name;
    private int numberOfPorts;
    private Port port;

    public Port(String name, int numberOfPorts) {
        this.name = name;
        this.numberOfPorts = numberOfPorts;

    }

    public void displayPortDetails() {
        System.out.println("Port Name: " + this.name);
        System.out.println("Number of Ports: " + this.numberOfPorts);
        port.displayPortDetails();
    }
}
