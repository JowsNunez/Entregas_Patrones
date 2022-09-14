package mx.arquitectura.factories;

/**
 * @Class Sobre clase que implementa la interface Paquete
 */
public class Sobre implements Paquete{
    public final double COSTO = 5;

    /**
     * Metodo que devuelve el costo del  sobre
     * @return
     */
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
