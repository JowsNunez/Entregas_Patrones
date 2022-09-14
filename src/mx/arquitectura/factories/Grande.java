package mx.arquitectura.factories;

/**
 * @Class Grande que implementa la interfaz paquete
 */
public class Grande implements Paquete{
    public final double COSTO = 50;

    /**
     * Metodo que devuelve el costo de paquete grande.
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public String toString() {
        return "Grande";
    }
}
