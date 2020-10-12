package CreationalDesignPatterns.FactoryMethod;

public class CreateWorker implements WorkerFactory {

    @Override
    public Worker createWorker(String worker) {
        switch (worker) {
            case ("ARCHITECT"):
                return new Architect();
            case ("TEACHER"):
                return new Teacher();
            default:
                return null;
        }
    }
}
