package CreationalDesignPatterns.AbstractFactoryMethod;

public class MilkChocolateFactory extends ChocolateFactory {
    @Override
    Chocolate makeChocolate() {
        return new MilkChocolate();
    }
}
