package ca.ns.navid.shx.patterns.creational.factorymethod;

public class Server implements Computer {

    public Server() {}

    @Override
    public void compute() {
        IO.println("Server is Computing...");
    }
}
