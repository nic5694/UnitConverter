package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestLength {
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
    public void Length_ConversionTest_KMtoM() {
        Length l1 = new Length();
        double value= l1.convert("Km","m",5);
        assertEquals(5000,value);
    }

    @Test
    public void Length_ConversionTest_MtoKM(){
        Length l1 = new Length();
        double value=l1.convert("m","km",5000);
        assertEquals(5,value);
    }
}
