import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroAndZeroInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        LengthMesurement first = new LengthMesurement(Unit.INCH, 0);
        LengthMesurement second = new LengthMesurement(Unit.FEET, 0);
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
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 12);
        Assert.assertEquals(inch, feet);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 3);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertEquals(feet, yard);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        LengthMesurement feet = new LengthMesurement(Unit.FEET, 1);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 1);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        LengthMesurement inch = new LengthMesurement(Unit.INCH, 36);
        LengthMesurement yard = new LengthMesurement(Unit.YARD, 1);
        Assert.assertEquals(inch, yard);
    }
}
