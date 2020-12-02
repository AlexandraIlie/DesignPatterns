package StructuralDesignPatterns.Adapter;

public class AmericanDigitalScale implements DigitalScale {

    private Person person;

    public AmericanDigitalScale(Person person) {
        this.person = person;
    }

    @Override
    public double getWeight() {
        return person.getWeight();
    }
}
