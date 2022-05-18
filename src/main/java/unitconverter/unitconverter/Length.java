package unitconverter.unitconverter;

public class Length extends Unit{
    public Length() {
        //adding the conversion rates to the hash table
        //the factors are the factors needed to convert to the main unit of measurement m
        conversionrates.put("mm", new LinearEquation(0,0.001));
        conversionrates.put("cm", new LinearEquation(0,0.01));
        conversionrates.put("m", new LinearEquation(0,1));
        conversionrates.put("km", new LinearEquation(0,1000));
        conversionrates.put("in", new LinearEquation(0,0.0254));
        conversionrates.put("ft", new LinearEquation(0,0.3048));
        conversionrates.put("yd", new LinearEquation(0,0.9144));
        conversionrates.put("mile", new LinearEquation(0,1609.344));
    }

}
