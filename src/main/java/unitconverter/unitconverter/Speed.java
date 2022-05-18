package unitconverter.unitconverter;

public class Speed extends Unit{
    public Speed(){
        //adding conversion rates to the hashtable
        //Factors to convert to the main unit of measurement m/s
        conversionrates.put("m/s", new LinearEquation(0,1));
        conversionrates.put("f/s", new LinearEquation(0,0.3048));
        conversionrates.put("km/h", new LinearEquation(0,0.2778));
        conversionrates.put("m/h", new LinearEquation(0,0.447));
        conversionrates.put("knots", new LinearEquation(0,0.5144));
    }


}
