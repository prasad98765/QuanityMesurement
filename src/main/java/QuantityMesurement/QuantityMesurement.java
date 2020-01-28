package QuantityMesurement;

public class QuantityMesurement {

    Unit unit;
    double measure;

    public QuantityMesurement(Unit unit, double measure) {
        this.unit = unit;
        this.measure = measure;
    }

    public double unitConversion(double value) {
        return Math.round(unit.unitValue * value);
    }

    public double addition(QuantityMesurement val) {
        double val1 = unitConversion(this.measure);
        double val2 = unitConversion(val.measure);
        return val1 + val2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMesurement that = (QuantityMesurement) o;
        double value1 = this.unitConversion(measure);
        double value2 = that.unitConversion(that.measure);
        if (measure == 0 && that.measure == 0)
            return true;
        if (value1 == value2)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                unit == that.unit;
    }

}
