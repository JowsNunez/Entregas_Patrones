package mx.arquitectura.chains;

import mx.arquitectura.factories.Vehiculo;

public interface ITransportador {
    public void setNext(ITransportador transportador);
    ITransportador getNext();
    Vehiculo transpotador(int distancia,String paquete, String servicio);
}
