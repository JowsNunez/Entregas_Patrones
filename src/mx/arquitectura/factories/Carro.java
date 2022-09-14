package mx.arquitectura.factories;


/**
 * @Class Carro que implementa la interfaz Vehiculo
 */
public class Carro implements Vehiculo {
    public final double COSTO = 30.0;

    public final int VELOCIDAD = 40;

    /**
     * Constructor vacio que crea una instancia de la clase Carro
     */
    public Carro(){

    }

    /**
     * Metodo que devuelve el costo por el uso de carro en un servicio
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * Metodo que regresa la velocidad en Km/hr de un carro.
     * @return
     */
    @Override
    public int getVelocidad() {
        return this.VELOCIDAD;
    }

    @Override
    public String toString() {
        return "Carro";
    }
}
