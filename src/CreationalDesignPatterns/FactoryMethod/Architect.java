package CreationalDesignPatterns.FactoryMethod;

public class Architect implements Worker {
    @Override
    public void routineBeforeWork() {
        System.out.println("Architect's routine before work");
    }

    @Override
    public void work() {
        System.out.println("The architect is working");
    }

    @Override
    public void routineAfterWork() {
        System.out.println("Architect's routine after work");
    }

    @Override
    public void sleep() {
        System.out.println("Architect is sleeping");
    }
}
