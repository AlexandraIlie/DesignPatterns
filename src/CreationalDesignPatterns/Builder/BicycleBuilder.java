package CreationalDesignPatterns.Builder;

public interface BicycleBuilder {
    void builtFrame();

    void addSuspension();

    void numberOfSpeeds(int number);

    void addSaddle();

    void addWheels();

    void addbreaks();

    Bicycle getBicycle();

}
