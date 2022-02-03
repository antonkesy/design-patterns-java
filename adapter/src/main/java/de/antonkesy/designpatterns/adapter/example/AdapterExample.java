package de.antonkesy.designpatterns.adapter.example;

import de.antonkesy.designpatterns.adapter.pattern.Adapter;
import de.antonkesy.designpatterns.adapter.pattern.Context;

public class AdapterExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTarget(new Adapter());

        context.operation();
    }
}
