package ca.ns.navid.shx.patterns.creational.singleton;

public final class EagerSingle {

    private static final EagerSingle INSTANCE = new EagerSingle();

    private EagerSingle() {
    }

    public static EagerSingle getInstance() {
        return INSTANCE;
    }
}
