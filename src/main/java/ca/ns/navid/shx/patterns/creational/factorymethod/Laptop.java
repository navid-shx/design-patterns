package ca.ns.navid.shx.patterns.creational.factorymethod;

public class Laptop implements Computer {

    public Laptop() {}

    @Override
    public void compute() {
        IO.println("Laptop is computing...");
    }
}
