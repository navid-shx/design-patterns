package ca.ns.navid.shx.patterns.creational.abstractfactory.model;

public class HatchbackCar extends Car {

    public HatchbackCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String info() {
        return String.format("Type: %s%nBrand: %s%nModel: %s", "Hatchback", getBrand(), getModel());
    }
}
