package unitconverter.unitconverter;

public class Mass extends Unit{
    public Mass() {
        //ADD second conversion table (one tabble to baseline) (basleines to table)
        conversionrates.put("mg", new LinearEquation(0,0.000001));
        conversionrates.put("g", new LinearEquation(0,0.001));
        conversionrates.put("kg", new LinearEquation(0,1));
        conversionrates.put("mt", new LinearEquation(0,1000));
        conversionrates.put("oz", new LinearEquation(0,0.02835));
        conversionrates.put("lb", new LinearEquation(0,0.453592));
        conversionrates.put("stone", new LinearEquation(0,6.350293));
        conversionrates.put("st", new LinearEquation(0,907.1847));
        conversionrates.put("lt", new LinearEquation(0,1016.047));
    }


}
