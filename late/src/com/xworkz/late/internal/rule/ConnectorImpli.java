package com.xworkz.late.internal.rule;

public class ConnectorImpli implements Connector{

    public ConnectorImpli(){
        super();
        System.out.println("no-arg const of ConImpli");
    }

    @Override
    public void run() {
        System.out.println("running run in ConnectorImpli");
    }
}
