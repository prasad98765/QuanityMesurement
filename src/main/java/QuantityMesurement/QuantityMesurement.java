package QuantityMesurement;

public class QuantityMesurement {

    Unit unit;
    double measure;

    public QuantityMesurement(Unit unit, double measure) {
        this.unit = unit;
        this.measure = measure;
    }

    public double Unitconversion(double value) {
        return Math.round(unit.unitValue * value);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMesurement that = (QuantityMesurement) o;
        double value1 = this.Unitconversion(measure);
        double value2 = that.Unitconversion(that.measure);
        if (measure == 0 && that.measure == 0)
            return true;
        if (value1 == value2)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                unit == that.unit;
    }

    @Override
    public String toString() {
        return "QuantityMesurement{" +
                "unit=" + unit +
                ", measure=" + measure +
                '}';
    }
}
