package CreationalDesignPatterns.Builder;

public class LeisureBicycleBuilder implements BicycleBuilder {
    private Bicycle leisureBicycle = new Bicycle();

    public Bicycle getBicycle() {
        return this.leisureBicycle;
    }

    @Override
    public void builtFrame() {
        System.out.println("Aluminium step-over frame - light, rigid and stable");
    }

    @Override
    public void addSuspension() {
        System.out.println("1 suspension");
    }

    @Override
    public void numberOfSpeeds(int number) {
        System.out.println(number + " speeds");
    }

    @Override
    public void addSaddle() {
        System.out.println("The saddle offers optimal comfort by reducing pressure peaks by 40%");
    }

    @Override
    public void addWheels() {
        System.out.println("Large wheels for greater stability at high speeds");
    }

    @Override
    public void addbreaks() {

    }
}
