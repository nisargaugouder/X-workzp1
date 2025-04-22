package com.xworkz.late.external.follow;

import com.xworkz.late.internal.rule.Connector;

public class ConnectorUser {
    private Connector connector;
    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("no-arg con of ConnectorImli");
    }
    public void execute(){
        System.out.println("running execute in connector impli");
        if(this.connector != null){
            this.connector.run();
        }
        else{
            System.err.println("error not possible");
        }
    }

}
