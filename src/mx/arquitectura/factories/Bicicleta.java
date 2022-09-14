package mx.arquitectura.factories;

/**
 * @Class Bicicleta que implementa la interfaz Vehiculo
 */
public class Bicicleta implements Vehiculo{
    public final double COSTO = 5;
    public final int VELOCIDAD = 20;

    /**
     * Constructor vacio que crea una instancia de la clase
     */
    public Bicicleta(){

    }

    /**
     * Metodo que regresa el costo por el uso de Bicicleta
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * Metodo que regresa la velocidad en Km/hr de la bicicleta
     * @return
     */
    @Override
    public int getVelocidad() {
        return this.VELOCIDAD;
    }


    @Override
    public String toString() {
        return "Bicicleta";
    }
}
