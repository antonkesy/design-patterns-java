package de.antonkesy.designpatterns.singleton.pattern;

public class Singleton {
    private static Singleton INSTANCE;
    private int otherAttributes;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void otherOperations() {
        System.out.println("Singleton - other operations " + otherAttributes);
    }
}
