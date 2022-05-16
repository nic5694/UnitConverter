package unitconverter.unitconverter;

public class MetricLength extends Unit{
    public MetricLength(double baseline, double value) {
        super(baseline, value);
    }
    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
