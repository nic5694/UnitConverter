package unitconverter.unitconverter;

public class ImpSpeed extends Unit{
    public ImpSpeed(double baseline, double value) {
        super(baseline, value);
    }

    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
