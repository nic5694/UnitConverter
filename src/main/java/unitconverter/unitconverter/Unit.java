package unitconverter.unitconverter;

import java.util.Hashtable;
import java.util.Locale;

public abstract class Unit implements Convertible{
    //Hashtable holding all the unit keys and conversion factors
    protected Hashtable <String,LinearEquation> conversionrates = new Hashtable<>();

    public Unit (){}

    //Method used by all 3 classes extending from it
    //this is the method that converts from the units given to the units desired
    public double convert(String fromUnit, String toUnit, double amount) {
        //converting the fromUnit amount to the baseline amount
        double baselineAmount=conversionrates.get(fromUnit.toLowerCase(Locale.ROOT)).evaluateToBaseline(amount);
        //using the baseline amount to calculate the equivalence to the desired unit and returning
        return conversionrates.get(toUnit.toLowerCase(Locale.ROOT)).evaluateFromBaseline(baselineAmount);
    }
}
