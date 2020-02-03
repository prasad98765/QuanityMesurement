import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class ValueAdditionTest {

    //----------------------------------------------------LENGTH UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenTwoInchAndTwoInch_shouldReturnFourInch() {
        QuantityMesurement inch1 = new QuantityMesurement(Unit.INCH, 2);
        QuantityMesurement inch2 = new QuantityMesurement(Unit.INCH, 2);
        double additionValue = inch1.addition(inch2);
        Assert.assertEquals(inch1,inch2);
        Assert.assertEquals(4,additionValue,0);
    }

    @Test
    public void givenOneFeetAndTwoInch_shouldReturnFourteenInch() {
        QuantityMesurement feet = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 2);
        double additionValue = feet.addition(inch);
        Assert.assertEquals(14,additionValue,0);
    }

    @Test
    public void givenOneFeetAndOneFeet_shouldReturnTwentyFourInch() {
        QuantityMesurement feet1 = new QuantityMesurement(Unit.FEET, 1);
        QuantityMesurement feet2 = new QuantityMesurement(Unit.FEET, 1);
        double additionValue = feet1.addition(feet2);
        Assert.assertEquals(feet1,feet2);
        Assert.assertEquals(24,additionValue,0);
    }

    @Test
    public void givenTwoInchAndTwoPointFiveCM_shouldReturnThreeInch() {
        QuantityMesurement inch = new QuantityMesurement(Unit.INCH, 2);
        QuantityMesurement cm = new QuantityMesurement(Unit.CM, 2.5);
        double additionValue = inch.addition(cm);
        Assert.assertEquals(3,additionValue,0.02);
    }
    //----------------------------------------------------VOLUME UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenOneGallonAndThreePointSevenLitres_shouldReturnSevenPointFiveLitres() {
        QuantityMesurement gallon = new QuantityMesurement(Unit.GALLON, 1);
        QuantityMesurement liter = new QuantityMesurement(Unit.LITRE, 3.78);
        double additionValue = gallon.addition(liter);
        Assert.assertEquals(gallon,liter);
        Assert.assertEquals(7.56,additionValue,0.03);
    }

    @Test
    public void givenOneLitreAndOneThousandML_shouldReturnTwoLitres() {
        QuantityMesurement liter = new QuantityMesurement(Unit.LITRE, 1);
        QuantityMesurement ml = new QuantityMesurement(Unit.ML,1000);
        double additionValue = liter.addition(ml);
        Assert.assertEquals(liter,ml);
        Assert.assertEquals(2,additionValue,0.0);
    }
    //----------------------------------------------------MASS UNIT VALUE ------------------------------------------------------------------
    @Test
    public void givenOneTonneAndOneThousandGram_shouldReturnSum_InUnitKG() {
        QuantityMesurement tonne = new QuantityMesurement(Unit.TONNE, 1);
        QuantityMesurement grams = new QuantityMesurement(Unit.GRAMS ,1000);
        double additionValue = tonne.addition(grams);
        Assert.assertEquals(1001,additionValue,0);
    }
}
