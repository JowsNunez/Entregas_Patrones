package mx.arquitectura.factories;


/**
 * @Class Express clase que implementa la interfaz Servicio.
 */
public class Express implements Servicio{
    public final double COSTO = 50;
    public double distancia;

    /**
     * Constructor que crea una instancia de la Express
     * @param distancia representa la distancia del servicio.
     */
    public Express(double distancia){
        this.distancia = distancia;
    }

    /**
     * Metodo que devuelve el costo del servicio
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * Metodo que devuelve la distancia del servicio
     * @return
     */
    @Override
    public double getDistancia() {
        return 0;
    }

    @Override
    public String toString() {
        return "Express{" +
                "COSTO=" + COSTO +
                ", distancia=" + distancia +
                '}';
    }
}
