package QuantityMesurement;

public class MesurementException extends Exception {
    public enum Type {NULL_VALUE}
    public Type type;

    public MesurementException(String message, Type type) {
        super(message);
        this.type = type;
    }
}
