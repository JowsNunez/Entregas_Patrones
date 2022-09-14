package mx.arquitectura.facade;

import mx.arquitectura.chains.ITransportador;
import mx.arquitectura.chains.Transportador;
import mx.arquitectura.factories.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase Paqueteria que implementa la interface paqueteria
 */
public class Paqueteria implements IPaqueteria{

    private Pedido pedido;

    public Paqueteria(){

    }

    /**
     * calcula el total del costo del pedido
     */
    @Override
    public void calcular()  {

        try{

        String Comandos[] =leer();
        String comando = Comandos[0].trim();
        String servicio = Comandos[1].trim();
        String paquete = Comandos[2].trim();
        Integer distancia = Integer.parseInt(Comandos[3]);

        if(!comando.equalsIgnoreCase("calcular"))  {
            System.out.println("comando invalido");
            return;
        }

       Vehiculo vehiculo = encontrarVehiculo(servicio,paquete,distancia);

       pedido = new Pedido(distancia,
               crearServicio(servicio,distancia),
               vehiculo,
               crearPaquete(paquete));


        double costo =pedido.getPaquete().getCosto() +
                pedido.getServicio().getCosto() +
                pedido.getVehiculo().getCosto() +
                adicionalKm(distancia);
                pedido.setTotal(costo);

        System.out.println(pedido + ", tiempo estimado: " + tiempo(distancia, vehiculo.getVelocidad())+" minutos");

        }catch (Exception e){
            System.err.println(e.getMessage());
        }

    }

    /**
     * Lee los comandos en consola y devuelve un arreglo de cadenas
     * @return
     */
    @Override
    public String[] leer() {

        String comandos[] =null;

        System.out.println("Ejemplo de uso calcular --servicio=express --paqueteria=sobre --distancia=12");


        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String entrada=  bf.readLine();
            comandos= entrada.split("(--servicio=)|(--paqueteria=)|(--distancia=)");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
            return comandos;

    }

    /**
     * Metodo que encuentra el vehiculo adecuado para el pedido.
     * @param servicio cadena que Representa el tipo de servicio
     * @param paquete cadena que Representa el tipo de paquete
     * @param distancia Numero que Representa la distancia
     * @return
     */
    @Override
    public Vehiculo encontrarVehiculo(String servicio, String paquete, int distancia) {
        Vehiculo vehiculo;

        // ser crea una instancia del manejador
        ITransportador iTransportador = new Transportador();
        vehiculo = iTransportador.transportador(distancia, paquete, servicio);
        return vehiculo;
    }

    /**
     * Metodo crea un paquete
     * @param paquete cadena que representa un tipo de paquete
     * @return
     */
    @Override
    public Paquete crearPaquete(String paquete) throws Exception{

        // Objeto vacio Paquete
        Paquete nPaquete;

        // se verifica la cadena para devolver un tipo de paquete
        if(paquete.equalsIgnoreCase("mediano")){
            return  nPaquete = new Mediana();
        }
        if(paquete.equalsIgnoreCase("pequenia")){
            return  nPaquete = new Pequenia();
        }
        if(paquete.equalsIgnoreCase("sobre")){
            return  nPaquete = new Sobre();
        }
        if(paquete.equalsIgnoreCase("grande")){
            return  nPaquete = new Grande();
        }

        // cuando no existe la cadena ingresada devuelve una Excepcion
        throw new Exception("Paquete inexistente");
    }

    /**
     * Metodo que crea un servicio
     * @param servicio cadena que representa el tipo de servicio
     * @param distancia numero que representa la distancia
     * @return
     * @throws Exception
     */
    @Override
    public Servicio crearServicio(String servicio, int distancia) throws Exception {
        Servicio nServicio;

        if(servicio.equalsIgnoreCase("estandar")){
            return  nServicio = new Estandar(distancia);
        }
        if(servicio.equalsIgnoreCase("express")){
            return  nServicio = new Express(distancia);
        }



        throw new Exception("Servicio inexistente");
    }

    /**
     * metodo que calcula el costo adicional despues de 10 km de distancia
     * @param distancia representa la distancia del servicio
     * @return
     */
    private double adicionalKm(int distancia){

        if(distancia>10){

            int adicionales = distancia-10;
            return adicionales*5.00;

        }
        return 0;

    }

    /**
     * Metodo que calcula y devuelve el tiempo estimado en minutos
     * @param distancia representa la distancia del pedido.
     * @param velocidad representa la velocidad del vehiculo
     * @return
     */
    private int tiempo(double distancia, double velocidad){
        return (int)((distancia/velocidad) * 60);
    }



}
