package QuantityMesurement;

import java.util.Objects;

public class Feet {
    public double value;

    public Feet(Double value) throws MesurementException {
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
        Feet feet = (Feet) o;
        return Objects.equals(value, feet.value);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
