package mx.arquitectura.factories;

/**
 * @cClass clase que implementa la interface paquete
 */
public class Pequenia implements Paquete{
    public final double COSTO = 10;

    /**
     * Metodo que debvuelve el costo del paquete
     * @return
     */
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
