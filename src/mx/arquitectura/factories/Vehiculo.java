package mx.arquitectura.factories;

/**
 * @Interface Vehiculo interface que representa un tipo de vehiculo.
 */
public interface Vehiculo {
    /**
     * Metodo que regresa el costo del uso de un vehiculo.
     * @return
     */
    double getCosto();
    /**
     * Metodo que regresa la velocidad vehiculo.
     * @return
     */
    int getVelocidad();

    String toString();
}
