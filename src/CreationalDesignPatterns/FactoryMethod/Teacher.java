package CreationalDesignPatterns.FactoryMethod;

public class Teacher implements Worker{
    @Override
    public void routineBeforeWork() {
        System.out.println("Teacher's routine after work");
    }

    @Override
    public void work() {
        System.out.println("The teacher is working");
    }

    @Override
    public void routineAfterWork() {
        System.out.println("Teacher's routine after work");
    }

    @Override
    public void sleep() {
        System.out.println("Teacher is sleeping");
    }
}
