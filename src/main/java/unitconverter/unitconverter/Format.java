package unitconverter.unitconverter;

import java.text.DecimalFormat;

public class Format {
    public Format(){}

    protected String formater(double value){
        double temp;
        double count = 0;
        if (value < 1){
            temp=value;
            while (temp<1){
                temp*=10;
                count++;
            }
        }
        String f="#.##";
        for(int i=0;i<count;i++){
            f+="#";
        }
        DecimalFormat df = new DecimalFormat(f);
        return df.format(value);
    }
}
