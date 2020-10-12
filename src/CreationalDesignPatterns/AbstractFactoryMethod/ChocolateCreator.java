package CreationalDesignPatterns.AbstractFactoryMethod;

public class ChocolateCreator {

    public static ChocolateFactory getFactory(String type) {
        switch (type) {
            case ("MILK"):
                return new MilkChocolateFactory();
            case ("WHITE"):
                return new WhiteChocolateFactory();
        }
        return null;
    }
}
