import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        try {
            LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 1);
            LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.FEET, 1);
        } catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.FEET, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroAndZeroInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
        LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnException() {
        try {
            LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
            LengthMesurement second = new LengthMesurement(LengthMesurement.Unit.INCH, 1);
        } catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() throws MesurementException {
        LengthMesurement first = new LengthMesurement(LengthMesurement.Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }
}
