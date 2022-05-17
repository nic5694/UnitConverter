package unitconverter.unitconverter;

public class Length extends Unit{
    public Length() {
        conversionrates.put("mm",new LinearEquation(0,0.001));
        conversionrates.put("cm", new LinearEquation(0,0.01));
        conversionrates.put("m",new LinearEquation(0,1));
        conversionrates.put("km", new LinearEquation(0,1000));
        conversionrates.put("in", new LinearEquation(0,0.0254));
        //TODO fill out the rest of the conversion table

    }

}
