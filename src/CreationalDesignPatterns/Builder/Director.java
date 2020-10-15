package CreationalDesignPatterns.Builder;

public class Director {
    BicycleBuilder myBuilder;

    public void construct(BicycleBuilder builder) {
        myBuilder = builder;
        myBuilder.builtFrame();
        myBuilder.addSaddle();
        myBuilder.addSuspension();
        myBuilder.addWheels();
        myBuilder.addbreaks();
    }
}
