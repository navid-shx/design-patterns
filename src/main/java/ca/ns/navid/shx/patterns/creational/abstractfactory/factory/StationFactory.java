package ca.ns.navid.shx.patterns.creational.abstractfactory.factory;

import ca.ns.navid.shx.patterns.creational.abstractfactory.model.Car;
import ca.ns.navid.shx.patterns.creational.abstractfactory.model.StationCar;

public class StationFactory implements CarFactory {

    @Override
    public Car createCar(String brand, String model) {
        return new StationCar(brand, model);
    }

}
