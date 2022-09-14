package mx.arquitectura.facade;

import mx.arquitectura.chains.ITransportador;
import mx.arquitectura.chains.Transportador;
import mx.arquitectura.factories.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paqueteria implements IPaqueteria{

    private Pedido pedido;

    public Paqueteria(){

    }

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

       //calcular --servicio=express --paqueteria=sobre --distancia=1
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

    @Override
    public Vehiculo encontrarVehiculo(String servicio, String paquete, int distancia) {
        Vehiculo vehiculo;

        ITransportador iTransportador = new Transportador();
        vehiculo = iTransportador.transportador(distancia, paquete, servicio);
        return vehiculo;
    }

    @Override
    public Paquete crearPaquete(String paquete) throws Exception{

        Paquete nPaquete;

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

        throw new Exception("Paquete inexistente");
    }

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

    public double adicionalKm(int distancia){

        if(distancia>10){

            int adicionales = distancia-10;
            return adicionales*5.00;

        }
        return 0;

    }

    public int tiempo(double distancia, double velocidad){
        return (int)((distancia/velocidad) * 60);
    }

    private boolean isExpress(String servicio){
        return servicio.equalsIgnoreCase("express");
    }

}
