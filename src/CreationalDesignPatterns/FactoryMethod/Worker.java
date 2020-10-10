package CreationalDesignPatterns.FactoryMethod;

public interface Worker {
    void routineBeforeWork();
    void work();
    void routineAfterWork();
    void sleep();
}
