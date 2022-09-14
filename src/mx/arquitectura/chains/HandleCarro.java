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
        Vehiculo    vehiculo=null;
        if( (paquete.equalsIgnoreCase("grande"))){
            return vehiculo = new Carro();
        }
        
        if(vehiculo==null){
            next.transportador(distancia, paquete, servicio);
        }
        
        return next.transportador(distancia,paquete, servicio);
    }
}