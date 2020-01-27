import QuantityMesurement.Feet;
import QuantityMesurement.Inch;
import QuantityMesurement.MesurementException;
import QuantityMesurement.QuantityMesure;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroAndZeroFeet_shouldReturnEqual() throws MesurementException {
        Feet first = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void givenNullFeetMesure_shouldReturnException() {
        try {
            Feet first = new Feet(null);
            Feet second = new Feet(null);
        }
        catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.NULL_VALUE, e.type);
        }
    }

    @Test
    public void givenSameReference_shouldReturnEqual() throws MesurementException {
        Feet first = new Feet(0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroAndZeroInch_shouldReturnEqual() throws MesurementException {
        Inch first = new Inch(0.0);
        Inch second = new Inch(0.0);
        Assert.assertEquals(first,second);
    }

    @Test
    public void givenNullInchMesure_shouldReturnException() {
        try {
            Inch first = new Inch(null);
            Inch second = new Inch(null);
        }
        catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.NULL_VALUE, e.type);
        }
    }
}
