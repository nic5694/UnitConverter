package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormatTest {
    @Test
    public void Format_Testing_Formating_Numbers1 (){
        Format f1 = new Format();
        String test= f1.formater( 0.012345);
        assertEquals("0.0123",test);
    }

    @Test
    public void Format_Testing_Formating_Numbers2(){
        Format f2 = new Format();
        String test = f2.formater(0.0001245);
        assertEquals("0.000124",test);
    }

    @Test
    public void Format_Testing_Formatting_Numbers3() {
        Format f3 = new Format();
        String test = f3.formater(0.0012345);
        assertEquals("0.00123", test);
    }


}
