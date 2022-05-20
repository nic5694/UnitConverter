package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedTest {
    @Test
    public void Speed_ConversionTest_MPStoMPS(){
        Speed s1 = new Speed();
        double value = s1.convert("m/s", "m/s", 50);
        assertEquals(50,value);
    }

    @Test
    public void Speed_ConversionTest_MPStoFPS(){
        Speed s1 = new Speed();
        double value = s1.convert("m/s", "ft/s", 50);
        assertEquals(164.041,value,0.001);
    }

    @Test
    public void Speed_ConversionTest_FPStoMPS(){
        Speed s1 = new Speed();
        double value = s1.convert("ft/s", "m/s", 50);
        assertEquals(15.24,value);
    }

    @Test
    public void Speed_ConversionTest_MPStoKPH(){
        Speed s1 = new Speed();
        double value = s1.convert("m/s", "km/h", 50);
        assertEquals(180,value,0.1);
    }

    @Test
    public void Speed_ConversionTest_KMPHtoMPS(){
        Speed s1 = new Speed();
        double value = s1.convert("km/h", "m/s", 180);
        assertEquals(50,value,0.01);
    }

    @Test
    public void Speed_ConversionTest_MPStoMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("m/s", "MPH", 20.11675);
        assertEquals(45,value,0.004);
    }

    @Test
    public void Speed_ConversionTest_MPHtoMPS(){
        Speed s1 = new Speed();
        double value = s1.convert("mph", "m/s", 45);
        assertEquals(20.11675,value,0.002);
    }

    @Test
    public void Speed_ConversionTest_MPStoKNOTS(){
        Speed s1 = new Speed();
        double value = s1.convert("m/s", "kn", 15.433333333333);
        assertEquals(30,value,0.003);
    }

    @Test
    public void Speed_ConversionTest_KNOTStoMPS(){
        Speed s1 = new Speed();
        double value = s1.convert("kn", "m/s", 30);
        assertEquals(15.4333333333,value,0.0000000001);
    }

    @Test
    public void Speed_ConversionTest_FPStoFPS(){
        Speed s1 = new Speed();
        double value = s1.convert("ft/s", "ft/s", 50);
        assertEquals(50,value);
    }

    @Test
    public void Speed_ConversionTest_FPStoKMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("ft/s", "km/h", 50);
        assertEquals(54.864,value,0.001);
    }

    @Test
    public void Speed_ConversionTest_KMPHtoFPS(){
        Speed s1 = new Speed();
        double value = s1.convert("km/h", "ft/s", 54.864);
        assertEquals(50,value,0.0000000001);
    }

    @Test
    public void Speed_ConversionTest_FPStoMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("ft/s", "mph", 50);
        assertEquals(34.090993823555,value,0.00000000001);
    }

    @Test
    public void Speed_ConversionTest_MPHtoFPS(){
        Speed s1 = new Speed();
        double value = s1.convert("mph", "ft/s", 34.090993823555);
        assertEquals(50,value, 0.00000000002);
    }

    @Test
    public void Speed_ConversionTest_FPStoKNOTS(){
        Speed s1 = new Speed();
        double value = s1.convert("ft/s", "kn", 50);
        assertEquals(29.624190064795,value,0.000000001);
    }

    @Test
    public void Speed_ConversionTest_KNOTStoFPS(){
        Speed s1 = new Speed();
        double value = s1.convert("kn", "ft/s", 29.624190064795);
        assertEquals(50,value,0.2);
    }

    @Test
    public void Speed_ConversionTest_KMPHtoKMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("km/h", "km/h", 50);
        assertEquals(50,value);
    }

    @Test
    public void Speed_ConversionTest_KMPHtoMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("km/h", "mph", 50);
        assertEquals(31.06864,value,0.00001);
    }

    @Test
    public void Speed_ConversionTest_MPHtoKMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("mph", "km/h", 31.06864);
        assertEquals(50,value,0.00001);
    }

    @Test
    public void Speed_ConversionTest_KMPHtoKNOTS(){
        Speed s1 = new Speed();
        double value = s1.convert("km/h", "kn", 50);
        assertEquals(26.997840172786,value,0.0000000002);
    }

    @Test
    public void Speed_ConversionTest_KNOTStoKMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("kn", "km/h", 26.997840172786);
        assertEquals(50,value,0.1);
    }

    @Test
    public void Speed_ConversionTest_MPHtoMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("mph", "mph", 50);
        assertEquals(50,value,0.1);
    }

    @Test
    public void Speed_ConversionTest_MPHtoKNOTS(){
        Speed s1 = new Speed();
        double value = s1.convert("mph", "kn", 50);
        assertEquals(43.448704103672,value,0.000000001);
    }

    @Test
    public void Speed_ConversionTest_KNOTStoMPH(){
        Speed s1 = new Speed();
        double value = s1.convert("kn", "mph", 43.448704103672);
        assertEquals(50,value,0.1);
    }

    @Test
    public void Speed_ConversionTest_KNOTStoKNOTS(){
        Speed s1 = new Speed();
        double value = s1.convert("kn", "kn", 50);
        assertEquals(50,value);
    }
}
