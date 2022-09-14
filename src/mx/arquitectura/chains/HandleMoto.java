package mx.arquitectura.chains;

import mx.arquitectura.factories.Vehiculo;

public class HandleMoto implements ITransportador{

    private ITransportador next;

    public HandleMoto(ITransportador next){
            this.next = next;
    }

    @Override
    public void setNext(ITransportador transportador) {
           
    }

    @Override
    public ITransportador getNext() {
        return null;
    }

    @Override
    public Vehiculo transpotador(int distancia, String paquete, String servicio) {
        return null;
    }
}
