package unitconverter.unitconverter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MassTest {
    @Test
    public void Mass_ConversionTest_MGtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "mg", 20);
        assertEquals(20, value);
    }

    @Test
    public void Mass_ConversionTest_MGtoG(){
        //TODO check on problem when passing 5 to convert when passing other numbers it works
        Mass m1 = new Mass();
        double value = m1.convert("mg", "g", 26);
        assertEquals(0.026, value);
    }

    @Test
    public void Mass_ConversionTest_GtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "mg", 20);
        assertEquals(20000, value);
    }

    @Test
    public void Mass_ConversionTest_MGtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "Kg", 1000000);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "mg", 5);
        assertEquals(5000000, value);
    }

    @Test
    public void Mass_ConversionTest_MGtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "mt", 2000000000);
        assertEquals(2, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "mg", 2);
        assertEquals(2000000000, value);
    }

    @Test
    public void Mass_ConversionTest_MGtoOZ(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "oz", 170097.1);
        assertEquals(6, value,0.001);
    }

    @Test
    public void Mass_ConversionTest_OZtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("oz", "mg", 6);
        assertEquals(170097.1, value,0.1);
    }

    @Test
    public void Mass_ConversionTest_MGtoLB(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "lb", 907184.74);
        assertEquals(2, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_LBtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("lb", "mg", 2);
        assertEquals(907184.74, value,0.00000001);
    }

    @Test
    public void Mass_ConversionTest_MGtoSTONE(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "stone", 12700586.36);
        assertEquals(2, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_STONEtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("stone", "mg", 2);
        assertEquals(12700586.36, value, 0.00000001);
    }

    @Test
    public void Mass_ConversionTest_MGtoST(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "st", 907184740);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_STtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("st", "mg", 1);
        assertEquals(907184740, value,0.000001);
    }

    @Test
    public void Mass_ConversionTest_MGtoLT(){
        Mass m1 = new Mass();
        double value = m1.convert("mg", "lt", 1016046908.8);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_LTtoMG(){
        Mass m1 = new Mass();
        double value = m1.convert("lt", "mg", 1);
        assertEquals(1016046908.8, value,0.000001);
    }

    @Test
    public void Mass_ConversionTest_GtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "g", 20);
        assertEquals(20, value);
    }

    @Test
    public void Mass_ConversionTest_GtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "kg", 2000);
        assertEquals(2, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "g", 2);
        assertEquals(2000, value);
    }

    @Test
    public void Mass_ConversionTest_GtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "mt", 5000000);
        assertEquals(5, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "g", 4);
        assertEquals(4000000, value);
    }

    @Test
    public void Mass_ConversionTest_GtoOZ(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "oz", 141.747615625);
        assertEquals(5, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("oz", "g", 5);
        assertEquals(141.747615625, value);
    }

    @Test
    public void Mass_ConversionTest_GtoLB(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "lb", 2267.96185);
        assertEquals(5, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("lb", "g", 5);
        assertEquals(2267.96185, value);
    }

    @Test
    public void Mass_ConversionTest_GtoSTONE(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "stone", 6350.29318);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_STONEtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("stone", "g", 1);
        assertEquals(6350.29318, value,0.000000000001);
    }
    @Test
    public void Mass_ConversionTest_GtoST(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "st", 907184.74);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_STtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("st", "g", 1);
        assertEquals(907184.74, value);
    }

    @Test
    public void Mass_ConversionTest_GtoLT(){
        Mass m1 = new Mass();
        double value = m1.convert("g", "lt", 1016046.9088);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_LTtoG(){
        Mass m1 = new Mass();
        double value = m1.convert("lt", "g", 1);
        assertEquals(1016046.9088, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "kg", 10);
        assertEquals(10, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "mt", 1000);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "kg", 1);
        assertEquals(1000, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoOZ(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "oz", 1.41747615625);
        assertEquals(50, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("oz", "kg", 50);
        assertEquals(1.41747615625, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoLB(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "lb", 5.44310844);
        assertEquals(12, value,0.00000000000001);
    }

    @Test
    public void Mass_ConversionTest_LBtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("lb", "kg", 12);
        assertEquals(5.44310844, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_KGtoSTONE(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "stone", 19.05087954);
        assertEquals(3, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("stone", "kg", 3);
        assertEquals(19.05087954, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoST(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "st", 907.18474);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_STtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("st", "kg", 1);
        assertEquals(907.18474, value);
    }

    @Test
    public void Mass_ConversionTest_KGtoLT(){
        Mass m1 = new Mass();
        double value = m1.convert("kg", "lt", 1016.0469088);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_LTtoKG(){
        Mass m1 = new Mass();
        double value = m1.convert("lt", "kg", 1);
        assertEquals(1016.0469088, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "mt", 5);
        assertEquals(5, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoOZ(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "oz", 1);
        assertEquals(35273.9619495804129, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("oz", "mt", 35273.9619495804129);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_MTtoLB(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "lb", 1);
        assertEquals(2204.62262184877581, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("lb", "mt", 2204.62262184877581);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_MTtoSTONE(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "stone", 1);
        assertEquals(157.473044417769701, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoMT(){
        Mass m1 = new Mass();
        double value = m1.convert("stone", "mt", 157.473044417769701);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_MTtoST(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "st", 1);
        assertEquals(1.1023113109243879, value);
    }

    @Test
    public void Mass_ConversionTest_STtoMT() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "mt", 1.1023113109243879);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_MTtoLT(){
        Mass m1 = new Mass();
        double value = m1.convert("mt", "lt", 1);
        assertEquals(0.984206527611060628, value);
    }

    @Test
    public void Mass_ConversionTest_LTtoMT() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "mt", 0.984206527611060628);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoOZ() {
        Mass m1 = new Mass();
        double value = m1.convert("oz", "oz", 12);
        assertEquals(12, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoLB() {
        Mass m1 = new Mass();
        double value = m1.convert("oz", "lb", 1);
        assertEquals(0.0625, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoOZ() {
        Mass m1 = new Mass();
        double value = m1.convert("lb", "oz", 0.0625);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoSTONE() {
        Mass m1 = new Mass();
        double value = m1.convert("oz", "stone", 1);
        assertEquals(0.00446428571428571429, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoOZ() {
        Mass m1 = new Mass();
        double value = m1.convert("stone", "oz", 0.00446428571428571429);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoST() {
        Mass m1 = new Mass();
        double value = m1.convert("oz", "st", 1);
        assertEquals(3.125E-5, value);
    }

    @Test
    public void Mass_ConversionTest_STtoOZ() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "oz", 3.125E-5);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_OZtoLT() {
        Mass m1 = new Mass();
        double value = m1.convert("oz", "lt", 1);
        assertEquals(2.79017857142857143E-5, value,0.00000000000000000001);
    }

    @Test
    public void Mass_ConversionTest_LTtoOZ() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "oz", 2.79017857142857143E-5);
        assertEquals(1, value,0.000000000000001);
    }

    @Test
    public void Mass_ConversionTest_LBtoLB() {
        Mass m1 = new Mass();
        double value = m1.convert("lb", "lb", 1);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoSTONE() {
        Mass m1 = new Mass();
        double value = m1.convert("lb", "stone", 1);
        assertEquals(0.0714285714285714286, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoLB() {
        Mass m1 = new Mass();
        double value = m1.convert("stone", "lb", 0.0714285714285714286);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoST() {
        Mass m1 = new Mass();
        double value = m1.convert("lb", "st", 1);
        assertEquals(5.E-4, value);
    }

    @Test
    public void Mass_ConversionTest_STtoLB() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "lb", 5.E-4);
        assertEquals(1, value);
    }

    @Test
    public void Mass_ConversionTest_LBtoLT() {
        Mass m1 = new Mass();
        double value = m1.convert("lb", "lt", 1000);
        assertEquals(0.4464285714285714285714, value);
    }

    @Test
    public void Mass_ConversionTest_LTtoLB() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "lb", 0.4464285714285714285714);
        assertEquals(1000, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoSTONE() {
        Mass m1 = new Mass();
        double value = m1.convert("stone", "stone", 35);
        assertEquals(35, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoST() {
        Mass m1 = new Mass();
        double value = m1.convert("stone", "st", 35);
        assertEquals(0.245, value,0.0000000000000001);
    }

    @Test
    public void Mass_ConversionTest_STtoSTONE() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "stone", 0.245);
        assertEquals(35, value);
    }

    @Test
    public void Mass_ConversionTest_STONEtoLT() {
        Mass m1 = new Mass();
        double value = m1.convert("stone", "lt", 35);
        assertEquals(0.21875, value,0.0000000000000001);
    }

    @Test
    public void Mass_ConversionTest_LTtoSTONE() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "stone", 0.21875);
        assertEquals(35, value);
    }

    @Test
    public void Mass_ConversionTest_STtoST() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "st", 35);
        assertEquals(35, value);
    }

    @Test
    public void Mass_ConversionTest_STtoLT() {
        Mass m1 = new Mass();
        double value = m1.convert("st", "lt", 35);
        assertEquals(31.25, value,0.00000000000001);
    }

    @Test
    public void Mass_ConversionTest_LTtoST() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "st", 31.25);
        assertEquals(35, value);
    }

    @Test
    public void Mass_ConversionTest_LTtoLT() {
        Mass m1 = new Mass();
        double value = m1.convert("lt", "lt", 35);
        assertEquals(35, value);
    }
}