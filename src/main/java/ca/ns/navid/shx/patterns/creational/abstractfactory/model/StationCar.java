package ca.ns.navid.shx.patterns.creational.abstractfactory.model;

public class StationCar extends Car {

    public StationCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String info() {
        return String.format("Type: %s%nBrand: %s%nModel: %s", "Station", getBrand(), getModel());
    }
}
