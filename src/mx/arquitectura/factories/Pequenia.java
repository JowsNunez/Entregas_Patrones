package mx.arquitectura.factories;

public class Pequenia implements Paquete{
    public final double COSTO = 10;
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public String toString() {
        return "Pequenia{" +
                "COSTO=" + COSTO +
                '}';
    }
}
