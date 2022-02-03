package de.antonkesy.designpatterns.singleton.example;

import de.antonkesy.designpatterns.singleton.pattern.Singleton;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton.getInstance().otherOperations();

        Singleton singleton = Singleton.getInstance();
        singleton.otherOperations();
    }
}
