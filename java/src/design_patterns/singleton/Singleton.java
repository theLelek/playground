package design_patterns.singleton;

public class Singleton {

    private static Singleton singleton;

    int value;

    private Singleton(int value) {
        this.value = value;
    }

    public static Singleton getInstance() {
        if (singleton != null) return singleton;
        return singleton = new Singleton(-1);
    }

    public int getValue() {
        return value;
    }
}
