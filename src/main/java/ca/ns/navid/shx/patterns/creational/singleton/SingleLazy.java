package ca.ns.navid.shx.patterns.creational.singleton;

public final class SingleLazy {

    private static final  SingleLazy INSTANCE = new SingleLazy();

    private SingleLazy() {
        throw new UnsupportedOperationException("Singleton class - Do not instantiate");
    }

    public static SingleLazy getInstance() {
        return INSTANCE;
    }
}
