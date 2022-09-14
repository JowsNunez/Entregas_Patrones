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
        Vehiculo vehiculo = null;

        if (servicio.equalsIgnoreCase("estandar")) {
            if (distancia <= 1 && paquete.equalsIgnoreCase("sobre")) {
                return vehiculo = new Bicicleta();
            }
            if ((distancia >= 1 && distancia <= 5) && (paquete.equalsIgnoreCase("sobre") || paquete.equalsIgnoreCase("pequenia"))) {
                return vehiculo = new Bicicleta();
            }
            if (distancia<=5&& paquete.equalsIgnoreCase("mediano")) {
                return vehiculo = new Bicicleta();
            }
        }

        if (vehiculo == null) {
            next.transportador(distancia, paquete, servicio);
        }

        return next.transportador(distancia,paquete, servicio);
    }
}
