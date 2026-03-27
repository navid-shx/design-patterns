package ca.ns.navid.shx.patterns.creational.abstractfactory;

import ca.ns.navid.shx.patterns.creational.abstractfactory.factory.HatchbackFactory;
import ca.ns.navid.shx.patterns.creational.abstractfactory.factory.SedanFactory;
import ca.ns.navid.shx.patterns.creational.abstractfactory.factory.StationFactory;

public class Main {

    static void main() {

        String bmwInfo = new SedanFactory().createCar("BMW", "750e").info();
        IO.println(bmwInfo + "\n");

        String audiInfo = new HatchbackFactory().createCar("Audi", "A3").info();
        IO.println(audiInfo + "\n");

        String hondaInfo = new StationFactory().createCar("Honda", "Odyssey").info();
        IO.println(hondaInfo + "\n");
    }
}
