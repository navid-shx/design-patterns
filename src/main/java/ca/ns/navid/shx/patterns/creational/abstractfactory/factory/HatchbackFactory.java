package ca.ns.navid.shx.patterns.creational.abstractfactory.factory;

import ca.ns.navid.shx.patterns.creational.abstractfactory.model.Car;
import ca.ns.navid.shx.patterns.creational.abstractfactory.model.HatchbackCar;

public class HatchbackFactory implements CarFactory {

    @Override
    public Car createCar(String brand, String model) {
        return new HatchbackCar(brand, model);
    }
}
