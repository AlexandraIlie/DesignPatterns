package CreationalDesignPatterns.AbstractFactoryMethod;

public class MilkChocolate implements Chocolate {

    @Override
    public void addSugar() {
        System.out.println("30g sugar added");
    }

    @Override
    public void addButter() {
        System.out.println("50g butter added");
    }

    @Override
    public void addMilkPowder() {
        System.out.println("50g milk powder added");
    }

    public void addCacao() {
        System.out.println("50g cacao powder added");
    }

    public void addNuts() {
        System.out.println("Nuts added");
    }

}
