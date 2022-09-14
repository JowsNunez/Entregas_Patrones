package mx.arquitectura.facade;

import mx.arquitectura.factories.Paquete;
import mx.arquitectura.factories.Servicio;
import mx.arquitectura.factories.Vehiculo;

public interface IPaqueteria {
    void  calcular();
    String[] leer();
    Vehiculo encontrarVehiculo(String servicio, String paqueteria,int distancia);
    Paquete crearPaquete(String paquete) throws Exception;
    Servicio crearServicio(String servicio,int distancia) throws Exception;
}
