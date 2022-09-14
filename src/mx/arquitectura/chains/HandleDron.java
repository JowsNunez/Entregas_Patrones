package mx.arquitectura.chains;
import mx.arquitectura.factories.Dron;
import mx.arquitectura.factories.Vehiculo;

public class HandleDron implements  ITransportador{
    private ITransportador  next;

    public  HandleDron (){
       
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
        Vehiculo vehiculo=null;
        if(servicio.equalsIgnoreCase("express")) {
            if ((distancia > 0 && distancia<=1)&&(paquete.equalsIgnoreCase("sobre"))) {
                return new Dron();
            }
            if (distancia <= 1 && (paquete.equalsIgnoreCase("pequenia"))) {
                return new Dron();
            }
        }
        if(vehiculo==null){
            next.transportador(distancia, paquete, servicio);
        }

        return  next.transportador(distancia,paquete,servicio);
    }
}
