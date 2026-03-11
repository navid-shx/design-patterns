package ca.ns.navid.shx.patterns.creational.singleton;

public class Main {

    static void main() {

        LazySingle lazy = LazySingle.getInstance();
        EagerSingle eager = EagerSingle.getInstance();
    }
}
