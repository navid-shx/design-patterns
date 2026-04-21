package ca.ns.navid.shx.patterns.creational.singleton;

public final class LazySingle {

    private static LazySingle instance;

    private LazySingle() {
    }

    public static LazySingle getInstance() {

        if (instance == null) {
            instance = new LazySingle();
        }

        return instance;
    }
}
