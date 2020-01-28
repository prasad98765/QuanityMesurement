import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqual() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(Unit.INCH, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(Unit.INCH, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

//    ------

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0);
//        System.out.println(first.toString()+" "+second.toString());
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 1);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void givenOneFeetAndTwelveInch_shouldReturnEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void givenTwelveInchAndOneFeet_shouldReturnEqual() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 12);
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        Assert.assertEquals(inch, feet);
    }

//    --------

    @Test
    public void givenThreeFeetAndOneYard_shouldReturnEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 3);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertEquals(feet, yard);
    }

    @Test
    public void givenOneFeetAndOneYard_shouldReturnNotEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void givenOneInchAndOneYard_shouldReturnNotEqual() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThirtySixInch_shouldReturnEqual() {
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 36);
        Assert.assertEquals(yard, inch);
    }

    @Test
    public void givenThirtySixInchAndOneYard_shouldReturnEqual() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 36);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThreeFeet_shouldReturnEqual() {
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        LengthMesurement feet= new LengthMesurement(Unit.FEET, 3);
        Assert.assertEquals(yard,feet);
    }
}
