package mx.arquitectura.factories;

/**
 * @Class Moto clase que implementa la interfaz Vehiculo
 */
public class Moto implements  Vehiculo {
    public final double COSTO = 15;

    public final int VELOCIDAD = 45;

    /**
     * Constructor vacio que crea una instancia de Moto
     */
    public Moto(){

    }

    /**
     * Metodo que devuelve el costo del uso de moto en el servicio
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * Metodo que devuelve la velocidad en Km/hr de una moto.
     * @return
     */
    @Override
    public int getVelocidad() {
        return this.VELOCIDAD;
    }

    @Override
    public String toString() {
        return "Moto";
    }
}
