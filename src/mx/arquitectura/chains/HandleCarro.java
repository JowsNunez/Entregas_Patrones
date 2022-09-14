package mx.arquitectura.chains;
import mx.arquitectura.factories.Carro;
import mx.arquitectura.factories.Vehiculo;

public  class   HandleCarro implements  ITransportador{
    private ITransportador  next;

    public  HandleCarro(){

    }       
    
    @Override
    public void setNext(ITransportador transportador) {
            this.next = transportador;
    }

    @Override
    public ITransportador getNext() {
        return this.next;
    }


    @Override
    public Vehiculo transportador(int   distancia,  String  paquete,    String  servicio) {
        if( (paquete.equalsIgnoreCase("grande"))){
            return new Carro();
        }

        
        return next.transportador(distancia,paquete, servicio);
    }
}