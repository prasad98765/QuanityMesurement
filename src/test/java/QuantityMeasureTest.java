import QuantityMesurement.Feet;
import QuantityMesurement.MesurementException;
import QuantityMesurement.QuantityMesure;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroAndZeroFeet_shouldReturnEqual() throws MesurementException {
        Feet frist = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertEquals(frist,second);
    }

    @Test
    public void givenNullMesure_shouldReturnException() {
        try {
            Feet frist = new Feet(null);
            Feet second = new Feet(null);
        }
        catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.NULL_VALUE, e.type);
        }
    }
}
