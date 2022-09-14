package mx.arquitectura.factories;


/**
 * @Class Estandar clase que implementa la interfaz Servicio.
 */
public class Estandar implements Servicio{
    public final double COSTO = 30;
    public double distancia;

    /**
     * Constructor que crea una instancia de Estandar
     * @param distancia representa la distancia de la entrega
     */
    public Estandar(double distancia){
        this.distancia = distancia;
    }

    /**
     * metodo que devuelve el costo por el servicio estandar
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * Metodo que devuelve la distancia
     * @return
     */
    @Override
    public double getDistancia() {
        return 0;
    }

    @Override
    public String toString() {
        return "Estandar{" +
                "COSTO=" + COSTO +
                ", distancia=" + distancia +
                '}';
    }
}
