package unitconverter.unitconverter;

public class MetricMass extends Unit{
    public MetricMass(double baseline, double value) {
        super(baseline, value);
    }

    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
