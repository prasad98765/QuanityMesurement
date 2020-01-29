package QuantityMesurement;

public class QuantityMesurement {

    Unit unit;
    double measure;

    public QuantityMesurement(Unit unit, double measure) {
        this.unit = unit;
        this.measure = measure;
    }

    public double unitConversion() {
        return Math.round((this.unit.unitValue) * this.measure);
    }

    public double addition(QuantityMesurement val) {
        double val1 = this.unitConversion();
        double val2 = val.unitConversion();
        return val1 + val2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMesurement that = (QuantityMesurement) o;
        double value1 = this.unitConversion();
        double value2 = that.unitConversion();
        if (measure == 0 && that.measure == 0)
            return true;
        if (value1 == value2)
            return true;
        return Double.compare(that.measure, measure) == 0 &&
                unit == that.unit;
    }

}
