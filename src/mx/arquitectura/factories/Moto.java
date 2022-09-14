package mx.arquitectura.factories;

public class Moto implements  Vehiculo {
    public final double COSTO = 15;

    public final int VELOCIDAD = 45;

    public Moto(){

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
        return "Moto";
    }
}
