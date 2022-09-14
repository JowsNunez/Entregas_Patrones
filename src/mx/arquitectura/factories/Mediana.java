package mx.arquitectura.factories;

public class Mediana implements Paquete{
    public final double COSTO = 20;
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public String toString() {
        return "Mediana{" +
                "COSTO=" + COSTO +
                '}';
    }
}
