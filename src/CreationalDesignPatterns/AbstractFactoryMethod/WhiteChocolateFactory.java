package CreationalDesignPatterns.AbstractFactoryMethod;

public class WhiteChocolateFactory extends ChocolateFactory {
    @Override
    Chocolate makeChocolate() {
        return new WhiteChocolate();
    }
}
