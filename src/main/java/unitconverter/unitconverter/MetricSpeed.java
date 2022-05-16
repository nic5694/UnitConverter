package unitconverter.unitconverter;

public class MetricSpeed extends Unit{
    public MetricSpeed(double baseline, double value) {
        super(baseline, value);
    }

    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
