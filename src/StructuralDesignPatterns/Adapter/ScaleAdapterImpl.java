package StructuralDesignPatterns.Adapter;

public class ScaleAdapterImpl implements ScaleAdapter {
    private AmericanDigitalScale americanScale;

    public ScaleAdapterImpl(AmericanDigitalScale americanScale) {
        this.americanScale = americanScale;
    }

    @Override
    public double getWeight() {
        return convertLbsToKg(americanScale.getWeight());
    }

    public double convertLbsToKg(double weight){
        return weight * 0.453592;
    }
}
