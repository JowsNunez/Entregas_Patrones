package mx.arquitectura.chains;
import mx.arquitectura.factories.Bicicleta;
import mx.arquitectura.factories.Vehiculo;

public class HandleBici implements  ITransportador{
    private ITransportador  next;

    public  HandleBici (){
       
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
