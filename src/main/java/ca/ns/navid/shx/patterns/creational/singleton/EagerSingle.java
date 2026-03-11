package ca.ns.navid.shx.patterns.creational.singleton;

public final class EagerSingle {

    private static EagerSingle instance;

    private EagerSingle() {
        throw new UnsupportedOperationException("Singleton class - Do not instantiate");
    }

    public static EagerSingle getInstance() {

        if (instance == null) {
            instance = new EagerSingle();
        }

        return instance;
    }
}
