package de.antonkesy.designpatterns.template_method.example;

import de.antonkesy.designpatterns.template_method.pattern.ConcreteClass;

public class TemplateMethodExample {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethode();
    }
}
