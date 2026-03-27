package ca.ns.navid.shx.patterns.creational.abstractfactory.factory;

import ca.ns.navid.shx.patterns.creational.abstractfactory.model.Car;

public interface CarFactory {

    Car createCar(String brand, String model);
}
