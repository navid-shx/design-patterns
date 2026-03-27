package ca.ns.navid.shx.patterns.creational.abstractfactory.model;

public abstract class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract String info();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
