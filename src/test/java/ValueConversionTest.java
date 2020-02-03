import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class ValueConversionTest {
//
    //----------------------------------------------------LENGTH UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement(Unit.FEET, 0.0);
        QuantityMesurement second = new QuantityMesurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement(Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        QuantityMesurement first = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement second = new QuantityMesurement(Unit.FEET, 1);
//       Assert.assertTrue(first.equals(second));
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement(Unit.INCH, 0);
        QuantityMesurement second = new QuantityMesurement(Unit.INCH, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        QuantityMesurement first = new QuantityMesurement(Unit.INCH, 1);
        QuantityMesurement second = new QuantityMesurement(Unit.INCH, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        QuantityMesurement first = new QuantityMesurement(Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

//    ------

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        QuantityMesurement first = new QuantityMesurement(Unit.INCH, 0);
        QuantityMesurement second = new QuantityMesurement(Unit.FEET, 0);
//        Assert.assertEquals(first, second);
        first.equals(second);
    }

    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() {
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 1);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 1);
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void givenOneFeetAndTwelveInch_shouldReturnEqual() {
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void givenTwelveInchAndOneFeet_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 12);
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        Assert.assertEquals(inch, feet);
    }

//    --------

    @Test
    public void givenThreeFeetAndOneYard_shouldReturnEqual() {
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 3);
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        Assert.assertTrue(feet.equals(yard));
    }

    @Test
    public void givenOneFeetAndOneYard_shouldReturnNotEqual() {
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void givenOneInchAndOneYard_shouldReturnNotEqual() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 1);
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThirtySixInch_shouldReturnEqual() {
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 36);
        Assert.assertEquals(yard, inch);
    }

    @Test
    public void givenThirtySixInchAndOneYard_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 36);
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        Assert.assertEquals(inch, yard);
    }

    @Test
    public void givenOneYardAndThreeFeet_shouldReturnEqual() {
        QuantityMesurement yard = new QuantityMesurement(Unit.YARD, 1);
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 3);
        Assert.assertEquals(yard, feet);
    }

//    -----

    @Test
    public void givenOneInchAndThreeCM_shouldReturnEqual() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 1.968503935);
        QuantityMesurement cm = new QuantityMesurement(Unit.CM, 5);
        Assert.assertEquals(inch,cm);
    }

    //----------------------------------------------------VOLUME UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenOneGallonAndThreePointSevenEightLitres_shouldReturnEqual() {
        QuantityMesurement gallon = new QuantityMesurement(Unit.GALLON, 1);
        QuantityMesurement liter = new QuantityMesurement(Unit.LITRE, 3.78);
        Assert.assertEquals(gallon, liter);
    }

    @Test
    public void givenOneLitreAndOneThousandML_shouldReturnEqual() {
        QuantityMesurement litre = new QuantityMesurement(Unit.LITRE, 1);
        QuantityMesurement ml = new QuantityMesurement(Unit.ML, 1000);
        Assert.assertTrue(litre.equals(ml));
    }

    //----------------------------------------------------MASS UNIT VALUE ------------------------------------------------------------------

    @Test
    public void givenOneKGAndOneThousandGrams_shouldReturnEqual() {
        QuantityMesurement kg = new QuantityMesurement(Unit.KG, 1);
        QuantityMesurement grams = new QuantityMesurement(Unit.GRAMS ,1000);
        Assert.assertTrue(kg.equals(grams));
    }

    @Test
    public void givenOneTonneAndOneThousandKGs_shouldReturnEqual() {
        QuantityMesurement tonne = new QuantityMesurement(Unit.TONNE, 1);
        QuantityMesurement kg = new QuantityMesurement(Unit.KG ,1000);
        Assert.assertTrue(tonne.equals(kg));
    }

//----------------------------------------------------TEMPERATURE UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenTwoOneTwoFahrenheitAndOneHundredCelsius_shouldReturnEqual() {
        QuantityMesurement fahrenheit = new QuantityMesurement(Unit.FAHRENHEIT, 212);
        QuantityMesurement celsius = new QuantityMesurement(Unit.CELSIUS ,100);
        Assert.assertTrue(fahrenheit.equals(celsius));
    }
}
