package ca.ns.navid.shx.patterns.creational.prototype;

public class Main {

    static void main() {

        CondoApartment original = new CondoApartment(1, 5221, "Spring Garden Rd");
        CondoApartment prototype = original.clone();
    }
}
