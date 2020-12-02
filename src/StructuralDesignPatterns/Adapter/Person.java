package StructuralDesignPatterns.Adapter;

public class Person {
    private double weight;
    private int kcal;
    private double bonesWeight;

    public Person(double weight, int kcal, double bonesWeight) {
        this.weight = weight;
        this.kcal = kcal;
        this.bonesWeight = bonesWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public double getBonesWeight() {
        return bonesWeight;
    }

    public void setBonesWeight(double bonesWeight) {
        this.bonesWeight = bonesWeight;
    }
}
