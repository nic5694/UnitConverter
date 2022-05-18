package unitconverter.unitconverter;

public class LinearEquation{
    private double constant;
    private double factor;
    public LinearEquation(double constant, double factor){
        this.constant=constant;
        this.factor=factor;
    }
    //Getting the baseline equivalent of the amount entered
    public double evaluateToBaseline(double amount){
        return factor*amount+constant;
    }
    //evaluating from the baseline the amount entered to the desired unit amount
    public double evaluateFromBaseline(double amount){
        return (amount-constant)/factor;
    }

}
