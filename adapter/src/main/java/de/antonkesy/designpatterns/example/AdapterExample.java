package de.antonkesy.designpatterns.example;

import de.antonkesy.designpatterns.adapter.Adapter;
import de.antonkesy.designpatterns.adapter.Context;

public class AdapterExample {
    public static void main(String[] args) {
        Context context = new Context();

        context.setTarget(new Adapter());

        context.operation();
    }
}
