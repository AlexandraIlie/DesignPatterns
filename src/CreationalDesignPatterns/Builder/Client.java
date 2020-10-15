package CreationalDesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        BicycleBuilder mountainBike = new MountainBicycleBuilder();
        BicycleBuilder leisureBike = new LeisureBicycleBuilder();

        director.construct(mountainBike);
        Bicycle bike = mountainBike.getBicycle();
        bike.show();


        director.construct(leisureBike);
        bike = mountainBike.getBicycle();
        bike.show();
    }
}
