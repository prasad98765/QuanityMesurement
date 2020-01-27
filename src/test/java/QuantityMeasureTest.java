import QuantityMesurement.Feet;
import QuantityMesurement.QuantityMesure;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroAndZeroFeet_shouldReturnEqual() {
        Feet frist = new Feet(0.0);
        Feet second = new Feet(0.0);
        Assert.assertEquals(frist,second);
    }
}
