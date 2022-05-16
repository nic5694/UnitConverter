package unitconverter.unitconverter;

public class ImpLength extends Unit{
    public ImpLength(double baseline, double value) {
        super(baseline, value);
    }

    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
