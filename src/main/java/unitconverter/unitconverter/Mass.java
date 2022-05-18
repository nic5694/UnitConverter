package unitconverter.unitconverter;

public class Mass extends Unit{
    public Mass() {
        //adding conversion rates to the hashtable
        //the factors are the factors needed to convert to the main unit of measurement kg
        conversionrates.put("mg", new LinearEquation(0,0.000001));
        conversionrates.put("g", new LinearEquation(0,0.001));
        conversionrates.put("kg", new LinearEquation(0,1));
        conversionrates.put("mt", new LinearEquation(0,1000));
        conversionrates.put("oz", new LinearEquation(0,0.028349523125));
        conversionrates.put("lb", new LinearEquation(0,0.45359237));
        conversionrates.put("stone", new LinearEquation(0,6.35029318));
        conversionrates.put("st", new LinearEquation(0,907.18474));
        conversionrates.put("lt", new LinearEquation(0,1016.0469088));
    }


}
