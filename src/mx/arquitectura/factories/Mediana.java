package mx.arquitectura.factories;

/**
 * @Class Mediana clase que implementa la clase paquete
 */
public class Mediana implements Paquete{
    public final double COSTO = 20;

    /**
     * Metodo que devuelve el costo de paquete mediano
     * @return
     */
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
