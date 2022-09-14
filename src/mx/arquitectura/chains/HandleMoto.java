package mx.arquitectura.chains;

import mx.arquitectura.factories.Moto;
import mx.arquitectura.factories.Vehiculo;

public class HandleMoto implements ITransportador{

    private ITransportador next;

    public HandleMoto(){
            
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
    public Vehiculo transportador(int distancia, String paquete, String servicio) {

        Vehiculo vehiculo =null;

        if(servicio.equalsIgnoreCase("estandar")) {
            if (distancia > 5 && (paquete.equalsIgnoreCase("mediano"))) {
                return new Moto();
            }
            if (distancia < 5 && (paquete.equalsIgnoreCase("mediano"))) {
                return new Moto();
            }
        }else{
            if(distancia>1 && (paquete.equalsIgnoreCase("sobre") || paquete.equalsIgnoreCase("pequenia"))){
                return new Moto();
            }
    
            if(distancia<=5 && (paquete.equalsIgnoreCase("mediano"))){
                return new Moto();
            }

        }

        if(vehiculo==null){
            next.transportador(distancia,paquete, servicio);
        }
        
       



        return next.transportador(distancia,paquete, servicio);
    }
}
