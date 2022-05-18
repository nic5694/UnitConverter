package unitconverter.unitconverter;

import java.util.Hashtable;
import java.util.Locale;

public abstract class Unit implements Convertible{
    //Protected so we have access to the hashtable from all classes that extend Unit
    protected Hashtable <String,LinearEquation> conversionrates = new Hashtable<>();

    public Unit (){}

    //Method used by all 3 classes extending from it
    //this is the method that converts from the units given to the units desired
    public double convert(String fromUnit, String toUnit, double amount) {
        //TODO CHECK THE ROUNDING ROUND TO MAYBE 4 TO 6 POSITIONS
        //converting the fromUnit amount to the baseline amount
        double baselineAmount=conversionrates.get(fromUnit.toLowerCase(Locale.ROOT)).evaluateToBaseline(amount);
        //using the baseline amount to calculate the equivalence to the desired unit
        //TODO maybe implement try catch or try catch in javaFx application
        double finalAmount=conversionrates.get(toUnit.toLowerCase(Locale.ROOT)).evaluateFromBaseline(baselineAmount);
        //returning the answer
        return finalAmount;
    }
}
