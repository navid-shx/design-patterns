package ca.ns.navid.shx.patterns.creational.abstractfactory.model;

public class SedanCar extends Car {

    public SedanCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String info() {
        return String.format("Type: %s%nBrand: %s%nModel: %s", "Sedan", getBrand(), getModel());
    }
}
