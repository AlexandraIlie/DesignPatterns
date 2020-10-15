package CreationalDesignPatterns.Builder;

public class MountainBicycleBuilder implements BicycleBuilder {

    private Bicycle mountainBicycle = new Bicycle();

    public Bicycle getBicycle() {
        return this.mountainBicycle;
    }

    @Override
    public void builtFrame() {
        System.out.println("Robust steel frame");
    }

    @Override
    public void addSuspension() {
        System.out.println("2 suspensions(front&back)");
    }

    @Override
    public void numberOfSpeeds(int number) {
        System.out.println(number + " speeds");
    }

    @Override
    public void addSaddle() {
        System.out.println("saddle with a sporty design");
    }

    @Override
    public void addWheels() {
        System.out.println("MTB TYRES");
    }

    @Override
    public void addbreaks() {

    }
}
