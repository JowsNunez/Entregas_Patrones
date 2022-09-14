package mx.arquitectura.chains;
import mx.arquitectura.factories.Carro;
import mx.arquitectura.factories.Vehiculo;

public  class   HandleCarro implements  ITransportador {
    private ITransportador next;

    public HandleCarro() {

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
     * Verifica los parametros para regresar un Carro si no pasa al siguiente transportador
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
    @Override
    public Vehiculo transportador(int   distancia,  String  paquete,    String  servicio) {
        if( (paquete.equalsIgnoreCase("grande"))){
            return new Carro();
        }

        
        return next.transportador(distancia,paquete, servicio);
    }
}