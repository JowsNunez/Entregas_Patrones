package mx.arquitectura.chains;
import mx.arquitectura.factories.Dron;
import mx.arquitectura.factories.Vehiculo;

public class HandleDron implements  ITransportador{
    private ITransportador  next;

    public  HandleDron (){
       
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
     * Verifica los parametros para regresar un Dron si no pasa al siguiente transportador
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
    @Override
    public Vehiculo transportador(int   distancia,  String  paquete,    String  servicio) {
        if(servicio.equalsIgnoreCase("express")) {
            if ((distancia > 0 && distancia<=1)&&(paquete.equalsIgnoreCase("sobre"))) {
                return new Dron();
            }
            if (distancia <= 1 && (paquete.equalsIgnoreCase("pequenia"))) {
                return new Dron();
            }
        }
        return  next.transportador(distancia,paquete,servicio);
    }
}
