package unitconverter.unitconverter;

import java.util.Hashtable;

public abstract class Unit implements Convertible{
    private double value;
    private double baseline;
    private Hashtable <String,LinearEquation> conversionrates = new Hashtable<>();

    public Unit (double baseline, double value){
        this.baseline=baseline;
        this.value=value;
    }

    @Override
    public abstract double convert(double amount, Unit toUnit);
}
