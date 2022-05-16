package unitconverter.unitconverter;

public class ImpMass extends Unit{
    public ImpMass(double baseline, double value) {
        super(baseline, value);
    }

    @Override
    public double convert(double amount, Unit toUnit) {
        return 0;
    }
}
