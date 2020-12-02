package StructuralDesignPatterns.Adapter;

import java.text.DecimalFormat;

public class Client {
    public static void main(String[] args) {
        Person person = new Person(110.2, 2000, 2.9);
        AmericanDigitalScale americanScale = new AmericanDigitalScale(person);
        ScaleAdapterImpl europeanScale = new ScaleAdapterImpl(americanScale);
        System.out.format("%.1f", europeanScale.getWeight());


    }
}
