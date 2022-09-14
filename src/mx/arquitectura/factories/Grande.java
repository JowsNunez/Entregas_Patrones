package mx.arquitectura.factories;

public class Grande implements Paquete{
    public final double COSTO = 50;
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public String toString() {
        return "Grande";
    }
}
