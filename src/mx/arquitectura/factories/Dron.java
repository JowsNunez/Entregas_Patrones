package mx.arquitectura.factories;

public class Dron implements Vehiculo{
    public final double COSTO = 20;

    public final int VELOCIDAD = 60;

    public Dron(){

    }

    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public int getVelocidad() {
        return this.VELOCIDAD;
    }

    @Override
    public String toString() {
        return "Dron" ;
    }
}
