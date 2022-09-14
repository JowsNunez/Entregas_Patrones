package mx.arquitectura.chains;

import mx.arquitectura.factories.Vehiculo;

public class Transportador implements ITransportador {
   

        private ITransportador next;
    
        public Transportador(){
               
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
    
            

            HandleDron dron = new HandleDron();
            this.setNext(dron);
            HandleBici bici = new HandleBici();
            dron.setNext(bici); 
            HandleMoto moto = new HandleMoto();
            bici.setNext(moto);
            HandleCarro carro = new HandleCarro();
            


            
    
           
    
    
    
            return next.transportador(distancia,paquete, servicio);
        }

    
}
