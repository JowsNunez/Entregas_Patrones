package mx.arquitectura.chains;

import mx.arquitectura.factories.Vehiculo;

/**
 * @Interface ITransportador interface que representa al manejador
 */
public interface ITransportador {
    /**
     * Establece el valor del siguiente transportador
     * @param transportador Representa un transportador
     */
    public void setNext(ITransportador transportador);

    /**
     * Obtiene el valor de siguiente transportador
     * @return
     */
    ITransportador getNext();

    /**
     * devuelve un vehiculo
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
    Vehiculo transportador(int distancia,String paquete, String servicio);
}
