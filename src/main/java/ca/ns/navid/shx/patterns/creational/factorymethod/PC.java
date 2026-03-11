package ca.ns.navid.shx.patterns.creational.factorymethod;

public class PC implements Computer {

    public PC() {}

    @Override
    public void compute() {
        IO.println("PC is Computing...");
    }
}
