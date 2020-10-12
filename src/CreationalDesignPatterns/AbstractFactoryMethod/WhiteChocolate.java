package CreationalDesignPatterns.AbstractFactoryMethod;

public class WhiteChocolate implements Chocolate {

    @Override
    public void addSugar() {
        System.out.println("20g sugar added");
    }

    @Override
    public void addButter() {
        System.out.println("40g butter added");
    }

    @Override
    public void addMilkPowder() {
        System.out.println("40g milk powder added");
    }

    public void addEvilRaisins() {
        System.out.println("Evil raisins added");
    }
}
