package unitconverter.unitconverter;

public class Speed extends Unit{
    public Speed(){
        //adding conversion rates to the hashtable
        //Factors to convert to the main unit of measurement m/s
        conversionrates.put("m/s", new LinearEquation(0,1));
        conversionrates.put("ft/s", new LinearEquation(0,0.3048));
        conversionrates.put("km/h", new LinearEquation(0,0.277777777778));
        conversionrates.put("mph", new LinearEquation(0,0.447038888889));
        conversionrates.put("kn", new LinearEquation(0,0.514444444444));
    }


}
