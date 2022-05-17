package unitconverter.unitconverter;

import java.util.Hashtable;
import java.util.Locale;

public abstract class Unit implements Convertible{
    protected Hashtable <String,LinearEquation> conversionrates = new Hashtable<>();

    public Unit (){}

    public double convert(String fromUnit, String toUnit, double amount) {
        //TODO CHECK THE ROUNDING ROUND TO MAYBE 4 TO 6 POSITIONS
        double baselineAmount=conversionrates.get(fromUnit.toLowerCase(Locale.ROOT)).evaluateToBaseline(amount);
        //TODO maybe implement try catch or try catch in javaFx application
        double finalAmount=conversionrates.get(toUnit.toLowerCase(Locale.ROOT)).evaluateFromBaseline(baselineAmount);
        return Math.round(finalAmount);
    }
}
