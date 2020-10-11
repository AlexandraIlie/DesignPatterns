package CreationalDesignPatterns.AbstractFactoryMethod;

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        ChocolateFactory milkChocolate = ChocolateCreator.getFactory("MILK");
        Chocolate milkChoco = milkChocolate.makeChocolate();
        milkChoco.addSugar();
        milkChoco.addButter();
        milkChoco.addMilkPowder();
        System.out.println();

        ChocolateFactory whiteChocolate = ChocolateCreator.getFactory("WHITE");
        Chocolate whiteChoco = whiteChocolate.makeChocolate();
        whiteChoco.addSugar();
        whiteChoco.addButter();
        whiteChoco.addMilkPowder();
    }
}
