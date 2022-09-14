package mx.arquitectura.facade;

import mx.arquitectura.factories.Paquete;
import mx.arquitectura.factories.Servicio;
import mx.arquitectura.factories.Vehiculo;

/**
 * @Interface Ipaqueteria representa la fachada
 */
public interface IPaqueteria {
    /**
     * calcula el total del costo del pedido
     */
    void  calcular();

    /**
     * Lee los comandos en consola y devuelve un arreglo de cadenas
     * @return
     */
    String[] leer();

    /**
     * Metodo que encuentra el vehiculo adecuado para el pedido.
     * @param servicio cadena que Representa el tipo de servicio
     * @param paquete cadena que Representa el tipo de paquete
     * @param distancia Numero que Representa la distancia
     * @return
     */
    Vehiculo encontrarVehiculo(String servicio, String paquete,int distancia);
    /**
     * Metodo crea un paquete
     * @param paquete cadena que representa un tipo de paquete
     * @return
     */
    Paquete crearPaquete(String paquete) throws Exception;

    /**
     * Metodo que crea un servicio
     * @param servicio cadena que representa el tipo de servicio
     * @param distancia numero que representa la distancia
     * @return
     * @throws Exception
     */
    Servicio crearServicio(String servicio,int distancia) throws Exception;
}
