package QuantityMesurement;

import java.util.Objects;

public class Inch {
    public double value;

    public Inch(Double value) throws MesurementException {
        try {
            this.value = value;
        } catch (NullPointerException n){
            throw new MesurementException(n.getMessage(),MesurementException.Type.NULL_VALUE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
