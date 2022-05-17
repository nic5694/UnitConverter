package unitconverter.unitconverter;

public interface Convertible {
    double convert(String fromUnit, String toUnit, double amount);
}
