package mx.arquitectura.chains;
import mx.arquitectura.factories.Bicicleta;
import mx.arquitectura.factories.Vehiculo;

public class HandleBici implements  ITransportador{
    private ITransportador  next;

    public  HandleBici (){
       
    }

    /**
     * Establece el valor del siguiente transportador
     * @param transportador Representa un transportador
     */
    @Override
    public void setNext(ITransportador transportador) {
            this.next = transportador;
    }

    /**
     * Obitene el valor del siguiente transportador
     * @return
     */
    @Override
    public ITransportador getNext() {
        return this.next;
    }

    /**
     * Verifica los parametros para regresar una Bicicleta si no pasa al siguiente transportador
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
    @Override
    public Vehiculo transportador(int distancia, String paquete, String servicio) {


        if (servicio.equalsIgnoreCase("estandar")) {
            if (distancia <= 1 && paquete.equalsIgnoreCase("sobre")) {
                return new Bicicleta();
            }
            if ((distancia >= 1 && distancia <= 5) && (paquete.equalsIgnoreCase("sobre") || paquete.equalsIgnoreCase("pequenia"))) {
                return new Bicicleta();
            }
            if (distancia<=5&& paquete.equalsIgnoreCase("mediano")) {
                return new Bicicleta();
            }
        }
        return next.transportador(distancia,paquete, servicio);
    }
}
