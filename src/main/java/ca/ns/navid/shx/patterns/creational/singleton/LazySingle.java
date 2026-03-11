package ca.ns.navid.shx.patterns.creational.singleton;

public final class LazySingle {

    private static final LazySingle INSTANCE = new LazySingle();

    private LazySingle() {
        throw new UnsupportedOperationException("Singleton class - Do not instantiate");
    }

    public static LazySingle getInstance() {
        return INSTANCE;
    }
}
