package com.xworkz.late.runner;

import com.xworkz.late.external.follow.ConnectorUser;
import com.xworkz.late.internal.rule.Connector;
import com.xworkz.late.internal.rule.ConnectorImpli;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImpli();
        ConnectorUser connectorUser=new ConnectorUser(connector);
        connectorUser.execute();
    }
}
