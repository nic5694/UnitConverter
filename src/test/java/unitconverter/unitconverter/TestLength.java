package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestLength {
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
