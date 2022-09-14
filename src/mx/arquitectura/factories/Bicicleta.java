package mx.arquitectura.factories;

public class Bicicleta implements Vehiculo{
    public final double COSTO = 5;

    public final int VELOCIDAD = 20;

    public Bicicleta(){

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
        return "Bicicleta";
    }
}
