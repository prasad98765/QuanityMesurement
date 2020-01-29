package QuantityMesurement;

public enum Unit {

    FEET(12),
    INCH(1),
    YARD(36),
    CM(1 / 2.54),
    GALLON(1),
    LITER(1 / 3.78),
    ML(1 / 1000);;

    public double unitValue;

    Unit(double i) {
        unitValue = i;
    }
}