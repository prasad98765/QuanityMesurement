package QuantityMesurement;

public enum Unit {

    FEET(12),
    INCH(1),
    YARD(36),
    CM(0.393700787),
    GALLON(3.78),
    LITRE(1),
    ML(0.001);

    public double unitValue;

    Unit(double i) {
        unitValue = i;
    }
}