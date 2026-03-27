package ca.ns.navid.shx.patterns.creational.factorymethod;

import java.util.Optional;

public class Main {

    static void main() {

        Optional<Computer> pc = ComputerFactory.createComputer(Computer.Type.PC);
        Optional<Computer> laptop = ComputerFactory.createComputer(Computer.Type.LAPTOP);
        Optional<Computer> server = ComputerFactory.createComputer(Computer.Type.SERVER);

        pc.ifPresent(Computer::compute);
        laptop.ifPresent(Computer::compute);
        server.ifPresent(Computer::compute);
    }
}
