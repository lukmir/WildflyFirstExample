package com.wildflyfirstexample;

import org.wildfly.swarm.Swarm;

import org.jboss.logging.Logger;
import org.wildfly.swarm.undertow.UndertowFraction;

public class Main {

    public static void main(String[] args) throws Exception {

        UndertowFraction undertowFraction = new UndertowFraction();
        undertowFraction.applyDefaults();
        undertowFraction.httpPort(12345);

        Swarm swarm = new Swarm();
        swarm.fraction(undertowFraction);
        swarm.start().deploy();

        Logger.getLogger(Main.class).info("Main method launched!");
    }
}
