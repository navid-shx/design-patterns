package ca.ns.navid.shx.patterns.creational.factorymethod;

import java.util.Optional;

public final class ComputerFactory {

    private ComputerFactory() {
        throw new UnsupportedOperationException("Cannot instantiate ComputerFactory");
    }

    public static Optional<Computer> createComputer(Computer.Type type) {

        if (type == Computer.Type.PC) {
            return Optional.of(new PC());
        }

        if (type == Computer.Type.LAPTOP) {
            return Optional.of(new Laptop());
        }

        if (type == Computer.Type.SERVER) {
            return Optional.of(new Server());
        }

        return Optional.empty();
    }
}
