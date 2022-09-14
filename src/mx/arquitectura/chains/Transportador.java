package mx.arquitectura.chains;

import mx.arquitectura.factories.Vehiculo;

/**
 * @Class Transportador representa al manejador principal.
 */
public class Transportador implements ITransportador {


        private ITransportador next;

        public Transportador(){

        }

        /**
         * Establece el valor del siguiente transportador
         * @param transportador Representa un transportador
         */
        @Override
        public void setNext(ITransportador transportador) {
                this.next = transportador;
        }

        /**
         * Obitene el valor del siguiente transportador
         * @return
         */
        @Override
        public ITransportador getNext() {
            return this.next;
        }

    /**
     * Verifica todos los manejadores y devuelve un Vehiculo
     * @param distancia representa la distancia del servicio
     * @param paquete representa el tipo de paquete
     * @param servicio representa el tipo de servicio
     * @return
     */
        @Override
        public Vehiculo transportador(int distancia, String paquete, String servicio) {



            HandleDron dron = new HandleDron();
            this.setNext(dron);
            HandleBici bici = new HandleBici();
            dron.setNext(bici);
            HandleMoto moto = new HandleMoto();
            bici.setNext(moto);
            HandleCarro carro = new HandleCarro();
            moto.setNext(carro);

            return next.transportador(distancia,paquete, servicio);
        }


}
