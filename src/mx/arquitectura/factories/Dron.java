package mx.arquitectura.factories;

/**
 * @Class Dron clase implementa la interfaz  vehiculo
 */
public class Dron implements Vehiculo{
    public final double COSTO = 20;

    public final int VELOCIDAD = 60;

    /**
     * Constructor vacio que crea una instancia de la clase carro
     */
    public Dron(){

    }


    /**
     * metodo que regresa el costo del uso de dron.
     * @return
     */
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    /**
     * metodo que regresa la velocidad en Km/hr de dron.
     * @return
     */
    @Override
    public int getVelocidad() {
        return this.VELOCIDAD;
    }

    @Override
    public String toString() {
        return "Dron" ;
    }
}
