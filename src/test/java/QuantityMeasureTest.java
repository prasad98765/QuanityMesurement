import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.FEET, 0.0);
        QuantityMesurement second = new QuantityMesurement("LENGTH",Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement second = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.INCH, 0);
        QuantityMesurement second = new QuantityMesurement("LENGTH",Unit.INCH, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.INCH, 1);
        QuantityMesurement second = new QuantityMesurement("LENGTH",Unit.INCH, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

//    ------

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        QuantityMesurement first = new QuantityMesurement("LENGTH",Unit.INCH, 0);
        QuantityMesurement second = new QuantityMesurement("LENGTH",Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() {
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 1);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 1);
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void givenOneFeetAndTwelveInch_shouldReturnEqual() {
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void givenTwelveInchAndOneFeet_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 12);
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        Assert.assertEquals(inch, feet);
    }

//    --------

    @Test
    public void givenThreeFeetAndOneYard_shouldReturnEqual() {
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 3);
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        Assert.assertTrue(feet.equals(yard));
    }

    @Test
    public void givenOneFeetAndOneYard_shouldReturnNotEqual() {
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void givenOneInchAndOneYard_shouldReturnNotEqual() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 1);
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThirtySixInch_shouldReturnEqual() {
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 36);
        Assert.assertEquals(yard, inch);
    }

    @Test
    public void givenThirtySixInchAndOneYard_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 36);
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        Assert.assertEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThreeFeet_shouldReturnEqual() {
        QuantityMesurement yard = new QuantityMesurement("LENGTH",Unit.YARD, 1);
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 3);
        Assert.assertEquals(yard, feet);
    }

//    -----

    @Test
    public void givenOneInchAndThreeCM_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 1.968503935);
        QuantityMesurement cm = new QuantityMesurement("LENGTH",Unit.CM, 5);
        Assert.assertEquals(inch,cm);
    }

    @Test
    public void givenTwoInchAndTwoInch_shouldReturnFourInch() {
        QuantityMesurement inch1 = new QuantityMesurement("LENGTH",Unit.INCH, 2);
        QuantityMesurement inch2 = new QuantityMesurement("LENGTH",Unit.INCH, 2);
        double additionValue = inch1.addition(inch2);
        Assert.assertEquals(inch1,inch2);
        Assert.assertEquals(4,additionValue,0);
    }

    @Test
    public void givenOneFeetAndTwoInch_shouldReturnFourteenInch() {
        QuantityMesurement feet = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 2);
        double additionValue = feet.addition(inch);
        Assert.assertEquals(14,additionValue,0);
    }

    @Test
    public void givenOneFeetAndOneFeet_shouldReturnTwentyFourInch() {
        QuantityMesurement feet1 = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        QuantityMesurement feet2 = new QuantityMesurement("LENGTH",Unit.FEET, 1);
        double additionValue = feet1.addition(feet2);
        Assert.assertEquals(feet1,feet2);
        Assert.assertEquals(24,additionValue,0);
    }

    @Test
    public void givenTwoInchAndTwoPointFiveCM_shouldReturnThreeInch() {
        QuantityMesurement inch = new QuantityMesurement("LENGTH",Unit.INCH, 2);
        QuantityMesurement cm = new QuantityMesurement("LENGTH",Unit.CM, 2.5);
        double additionValue = inch.addition(cm);
       // Assert.assertEquals(inch,cm);
        Assert.assertEquals(3,additionValue,0.02);
    }

    @Test
    public void givenOneGallonAndThreePointSevenEightLitres_shouldReturnEqual() {
        QuantityMesurement gallon = new QuantityMesurement("VOLUME",Unit.GALLON, 1);
        QuantityMesurement liter = new QuantityMesurement("VOLUME",Unit.LITRE, 3.78);
        Assert.assertEquals(gallon, liter);
    }

    @Test
    public void givenOneLitreAndOneThousandML_shouldReturnEqual() {
        QuantityMesurement litre = new QuantityMesurement("VOLUME",Unit.LITRE, 1);
        QuantityMesurement ml = new QuantityMesurement("VOLUME",Unit.ML, 1000);
        Assert.assertTrue(litre.equals(ml));
    }

    @Test
    public void givenOneGallonAndThreePointSevenLitres_shouldReturnSevenPointFiveLitres() {
        QuantityMesurement gallon = new QuantityMesurement("VOLUME",Unit.GALLON, 1);
        QuantityMesurement liter = new QuantityMesurement("VOLUME",Unit.LITRE, 3.78);
        double additionValue = gallon.addition(liter);
        Assert.assertEquals(gallon,liter);
        Assert.assertEquals(7.56,additionValue,0.03);
    }

    @Test
    public void givenOneLitreAndOneThousandML_shouldReturnTwoLitres() {
        QuantityMesurement liter = new QuantityMesurement("VOLUME",Unit.LITRE, 1);
        QuantityMesurement ml = new QuantityMesurement("VOLUME",Unit.ML,1000);
        double additionValue = liter.addition(ml);
        Assert.assertEquals(liter,ml);
        Assert.assertEquals(2,additionValue,0.0);
    }

    @Test
    public void givenOneKGAndOneThousandGrams_shouldReturnEqual() {
        QuantityMesurement kg = new QuantityMesurement("MASS",Unit.KG, 1);
        QuantityMesurement grams = new QuantityMesurement("MASS",Unit.GRAMS ,1000);
        Assert.assertTrue(kg.equals(grams));
    }

}
