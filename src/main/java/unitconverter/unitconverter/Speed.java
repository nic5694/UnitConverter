package unitconverter.unitconverter;

public class Speed extends Unit{
    public Speed(){
        //adding conversion rates to the hashtable
        //Factors to convert to the main unit of measurement m/s
        conversionrates.put("mps", new LinearEquation(0,1));
        conversionrates.put("fps", new LinearEquation(0,0.3048));
        conversionrates.put("kmph", new LinearEquation(0,0.277777777778));
        conversionrates.put("mph", new LinearEquation(0,0.447038888889));
        conversionrates.put("knots", new LinearEquation(0,0.514444444444));
    }


}
