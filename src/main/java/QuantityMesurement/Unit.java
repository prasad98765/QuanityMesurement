package QuantityMesurement;

public enum Unit {

    FEET("LENGTH", 12),
    INCH("LENGTH", 1),
    YARD("LENGTH", 36),
    CM("LENGTH", 0.393700787),
    GALLON("VOLUME", 3.78),
    LITRE("VOLUME", 1),
    ML("VOLUME", 0.001),
    KG("MASS",1),
    GRAMS("MASS",0.001),
    TONNE("MASS",1000),
    FAHRENHEIT("TEMPERATURE"),
    CELSIUS("TEMPERATURE",1);

    public double unitValue;
    public String Type;


    Unit(String unitType, double val) {
        unitValue = val;
        Type = unitType;
    }

    Unit(String temperature) {
        Type = temperature;
    }
}