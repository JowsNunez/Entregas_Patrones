package mx.arquitectura.factories;

public class Sobre implements Paquete{
    public final double COSTO = 5;
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public String toString() {
        return "Sobre{" +
                "COSTO=" + COSTO +
                '}';
    }
}
