package mx.arquitectura.chains;

import mx.arquitectura.factories.Moto;
import mx.arquitectura.factories.Vehiculo;

public class HandleMoto implements ITransportador{

    private ITransportador next;

    public HandleMoto(){
            
    }

    /**
     * Establece el valor del siguiente transportador
     * @param transportador Representa un transportador
     */
    @Override
    public void setNext(ITransportador transportador) {
            this.next = transportador;
    }

    @Override
    public ITransportador getNext() {
        return this.next;
    }

    /**
     * Verifica los parametros para regresar una Moto si no pasa al siguiente transportador
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
    @Override
    public Vehiculo transportador(int distancia, String paquete, String servicio) {

        if(servicio.equalsIgnoreCase("estandar")) {
            if (distancia > 5 && (paquete.equalsIgnoreCase("mediano"))) {
                return new Moto();
            }
            if (distancia < 5 && (paquete.equalsIgnoreCase("mediano"))) {
                return new Moto();
            }
        }
        if (servicio.equalsIgnoreCase("express")) {
            if (distancia >= 1 && paquete.equalsIgnoreCase("sobre")) {
                return new Moto();
            }
            if (distancia >= 1 && paquete.equalsIgnoreCase("pequenia")) {
                return new Moto();
            }
            if (distancia >= 5 && paquete.equalsIgnoreCase("mediano")) {
                return new Moto();
            }
            if (distancia <= 5 && (paquete.equalsIgnoreCase("mediano"))) {
                return new Moto();
            }
        }

        return next.transportador(distancia,paquete, servicio);
    }
}
