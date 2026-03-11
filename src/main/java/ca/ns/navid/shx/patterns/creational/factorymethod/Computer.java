package ca.ns.navid.shx.patterns.creational.factorymethod;

public interface Computer {

    void compute();

    enum Type {
        PC,
        LAPTOP,
        SERVER
    }
}
