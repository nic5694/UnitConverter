package unitconverter.unitconverter;

public class LinearEquation{
    private double constant;
    private double factor;
    public LinearEquation(double constant, double factor){
        this.constant=constant;
        this.factor=factor;
    }
    public double evaluateToBaseline(double amount){
        return factor*amount+constant;
    }

    public double evaluateFromBaseline(double amount){
        return (amount-constant)/factor;
    }

}
