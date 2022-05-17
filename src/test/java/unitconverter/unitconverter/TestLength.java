package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestLength {

    @Test
    public void Length_ConversionTest_MMtoMM(){
        Length l1 = new Length();
        double value = l1.convert("mm","mm",20);
        assertEquals(20, value);
    }

    @Test
    public void Length_ConversionTest_MMtoCM(){
        Length l1 = new Length();
        double value = l1.convert("mm","cm",100);
        assertEquals(10, value);
    }

    @Test
    public void Length_ConversionTest_CMtoMM(){
        Length l1 = new Length();
        double value = l1.convert("cm","mm", 10);
        assertEquals(100, value);

    }

    @Test
    public void Length_ConversionTest_MMtoM(){
        Length l1 = new Length();
        double value = l1.convert("mm","m",100000);
        assertEquals(100, value);
    }

    @Test
    public void Length_ConversionTest_MtoMM(){
        Length l1 = new Length();
        double value = l1.convert("m","mm",100);
        assertEquals(100000, value);
    }

    @Test
    public void Length_ConversionTest_MMtoIN() {
        Length l1 = new Length();
        double value = l1.convert("mm", "in", 304.8);
        assertEquals(12, value);
    }

    @Test
    public void Length_ConversionTest_INtoMM() {
        Length l1 = new Length();
        double value = l1.convert("in", "mm", 12);
        assertEquals(304.8, value);
    }

    @Test
    public void Length_ConversionTest_MMtoFT() {
        Length l1 = new Length();
        double value = l1.convert("mm", "ft", 3657.6);
        assertEquals(12, value);
    }

    @Test
    public void Length_ConversionTest_FTtoMM() {
        Length l1 = new Length();
        double value = l1.convert("ft", "mm", 12);
        assertEquals(3657.6, value);
    }

    @Test
    public void Length_ConversionTest_MMtoYD() {
        Length l1 = new Length();
        double value = l1.convert("mm", "yd", 3657.6);
        assertEquals(4, value);
    }

    @Test
    public void Length_ConversionTest_YDtoMM() {
        Length l1 = new Length();
        double value = l1.convert("yd", "mm", 4);
        assertEquals(3657.6, value);
    }

    @Test
    public void Length_ConversionTest_MMtoMILE() {
        Length l1 = new Length();
        double value = l1.convert("mm", "mile", 1609344);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_MiletoMM() {
        Length l1 = new Length();
        double value = l1.convert("mm", "mile", 1609344);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_CMtoCM(){
        Length l1 = new Length();
        double value = l1.convert("cm","cm",20);
        assertEquals(20, value);
    }

    @Test
    public void Length_ConversionTest_CMtoM(){
        Length l1 = new Length();
        double value = l1.convert("cm","m",100);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_MtocM(){
        Length l1 = new Length();
        double value = l1.convert("m","cm",1);
        assertEquals(100, value);
    }

    @Test
    public void Length_ConversionTest_CMtoKM(){
        Length l1 = new Length();
        double value = l1.convert("cm","km",100000);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_KMtoCM(){
        Length l1 = new Length();
        double value = l1.convert("km","cm",1);
        assertEquals(100000, value);
    }

    @Test
    public void Length_ConversionTest_CMtoIN(){
        Length l1 = new Length();
        double value = l1.convert("cm","in",12.7);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_IntoCM(){
        Length l1 = new Length();
        double value = l1.convert("in","cm",5);
        assertEquals(12.7, value);
    }

    @Test
    public void Length_ConversionTest_CMtoFT(){
        Length l1 = new Length();
        double value = l1.convert("cm","ft",152.4);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_FTtoCM(){
        Length l1 = new Length();
        double value = l1.convert("ft","cm",5);
        assertEquals(152.4, value);
    }

    @Test
    public void Length_ConversionTest_CMtoYD(){
        Length l1 = new Length();
        double value = l1.convert("cm","yd",457.2);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_YDtoCM(){
        Length l1 = new Length();
        double value = l1.convert("yd","cm",5);
        assertEquals(457.2, value);
    }

    @Test
    public void Length_ConversionTest_CMtoMILE(){
        Length l1 = new Length();
        double value = l1.convert("cm","mile",160934);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_MILEtoCM(){
        Length l1 = new Length();
        double value = l1.convert("mile","cm",1);
        assertEquals(160934, value);
    }

    @Test
    public void Length_ConversionTest_MtoM(){
        Length l1 = new Length();
        double value=l1.convert("m","m",5);
        assertEquals(5, value);
    }


    @Test
    public void Length_ConversionTest_MtoKM(){
        Length l1 = new Length();
        double value=l1.convert("m","km",5000);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_KMtoM() {
        Length l1 = new Length();
        double value= l1.convert("Km","m",5);
        assertEquals(5000, value);
    }

    @Test
    public void Length_ConversionTest_MtoIN(){
        Length l1 = new Length();
        double value=l1.convert("m","in",5);
        assertEquals(196.85, value);
    }

    @Test
    public void Length_ConversionTest_INtoM(){
        Length l1 = new Length();
        double value=l1.convert("in","m",196.85);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_MtoFT(){
        Length l1 = new Length();
        double value=l1.convert("m","ft",3.048);
        assertEquals(10, value);
    }

    @Test
    public void Length_ConversionTest_FTtoM(){
        Length l1 = new Length();
        double value=l1.convert("ft","m",10);
        assertEquals(3.048, value);
    }

    @Test
    public void Length_ConversionTest_MtoMILE(){
        Length l1 = new Length();
        double value=l1.convert("m","mile",3218.69);
        assertEquals(2, value);
    }

    @Test
    public void Length_ConversionTest_MILEtoM(){
        Length l1 = new Length();
        double value=l1.convert("mile","m",2);
        assertEquals(3218.69, value);
    }

    @Test
    public void Length_ConversionTest_KMtoKM(){
        Length l1 = new Length();
        double value=l1.convert("km","km",5);
        assertEquals(5, value);
    }
    @Test
    public void Length_ConversionTest_KMtoIN(){
        Length l1 = new Length();
        double value=l1.convert("km","in",2);
        assertEquals(78740.2, value);
    }

    @Test
    public void Length_ConversionTest_INtoKM(){
        Length l1 = new Length();
        double value=l1.convert("in","km",78740.2);
        assertEquals(2, value);
    }

    @Test
    public void Length_ConversionTest_KMtoFT(){
        Length l1 = new Length();
        double value=l1.convert("km","ft",1);
        assertEquals(3280.84, value);
    }

    @Test
    public void Length_ConversionTest_FTtoKM(){
        Length l1 = new Length();
        double value=l1.convert("ft","km",3280.84);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_KMtoYD(){
        Length l1 = new Length();
        double value=l1.convert("km","yd",1);
        assertEquals(1093.61, value);
    }

    @Test
    public void Length_ConversionTest_YDtoKM(){
        Length l1 = new Length();
        double value=l1.convert("yd","km",1093.61);
        assertEquals(1, value);
    }

    @Test
    public void Length_ConversionTest_KMtoMILE(){
        Length l1 = new Length();
        double value=l1.convert("km","mile",5);
        assertEquals(3.10686, value);
    }

    @Test
    public void Length_ConversionTest_MILEtoKM(){
        Length l1 = new Length();
        double value=l1.convert("mile","km",3.10686);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_INtoIN(){
        Length l1 = new Length();
        double value=l1.convert("in","in",5);
        assertEquals(5, value);
    }

    @Test
    public void Length_ConversionTest_INtoFT(){
        Length l1 = new Length();
        double value=l1.convert("in","ft",72);
        assertEquals(6, value);
    }

    @Test
    public void Length_ConversionTest_FTtoIN(){
        Length l1 = new Length();
        double value=l1.convert("ft","in",6);
        assertEquals(72, value);
    }

    @Test
    public void Length_ConversionTest_INtoYD(){
        Length l1 = new Length();
        double value=l1.convert("in","yd",72);
        assertEquals(2, value);
    }

    @Test
    public void Length_ConversionTest_YDtoIN(){
        Length l1 = new Length();
        double value=l1.convert("yd","in",2);
        assertEquals(72, value);
    }

    @Test
    public void Length_ConversionTest_INtoMILE(){
        Length l1 = new Length();
        double value=l1.convert("in","mile",126720);
        assertEquals(2, value);
    }

    @Test
    public void Length_ConversionTest_MILEtoIN(){
        Length l1 = new Length();
        double value=l1.convert("mile","in",2);
        assertEquals(126720, value);
    }

    @Test
    public void Length_ConversionTest_FTtoFT(){
        Length l1 = new Length();
        double value=l1.convert("ft","ft",5);
        assertEquals(5,value);
    }

    @Test
    public void Length_ConversionTest_FTtoYD(){
        Length l1 = new Length();
        double value=l1.convert("ft","yd",15);
        assertEquals(5,value);
    }

    @Test
    public void Length_ConversionTest_YDtoFT(){
        Length l1 = new Length();
        double value=l1.convert("ft","ft",5);
        assertEquals(15,value);
    }

    @Test
    public void Length_ConversionTest_FTtoMILE(){
        Length l1 = new Length();
        double value=l1.convert("ft","mile",10560);
        assertEquals(2,value);
    }

    @Test
    public void Length_ConversionTest_MILEtoFT(){
        Length l1 = new Length();
        double value=l1.convert("mile","ft",2);
        assertEquals(10560,value);
    }

    @Test
    public void Length_ConversionTest_YDtoYD(){
        Length l1 = new Length();
        double value=l1.convert("yd","yd",5);
        assertEquals(5,value);
    }

    @Test
    public void Length_ConversionTest_YDtoMILE(){
        Length l1 = new Length();
        double value=l1.convert("yd","mile",10560);
        assertEquals(6,value);
    }

    @Test
    public void Length_ConversionTest_MILEtoYD(){
        Length l1 = new Length();
        double value=l1.convert("mile","yd",6);
        assertEquals(10560,value);
    }

    @Test
    public void Length_ConversionTest_MILEtoMIlE(){
        Length l1 = new Length();
        double value=l1.convert("mile","mile",5);
        assertEquals(5,value);
    }

}
