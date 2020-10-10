package CreationalDesignPatterns.FactoryMethod;

public class DeployingWorkers {
    public static void main(String[] args) {
        CreateWorker worker = new CreateWorker();
        System.out.println("DEPLOYING WORKERS");

        Worker architect = worker.createWorker("ARCHITECT");
        architect.routineBeforeWork();
        architect.work();
        architect.routineAfterWork();
        architect.sleep();

        System.out.println();

        Worker teacher = worker.createWorker("TEACHER");
        teacher.routineBeforeWork();
        teacher.work();
        teacher.routineAfterWork();
        teacher.sleep();




    }
}
