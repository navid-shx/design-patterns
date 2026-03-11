package ca.ns.navid.shx.patterns.singleton;

public final class SingleEager {

    private static SingleEager instance;

    private SingleEager() {
        throw new UnsupportedOperationException("Singleton class - Do not instantiate");
    }

    public static SingleEager getInstance() {

        if (instance == null) {
            instance = new SingleEager();
        }

        return instance;
    }
}
