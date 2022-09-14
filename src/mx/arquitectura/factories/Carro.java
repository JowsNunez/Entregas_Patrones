package mx.arquitectura.factories;

public class Carro implements Vehiculo {
    public final double COSTO = 30.0;

    public final int VELOCIDAD = 40;

    public Carro(){

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
        return "Carro";
    }
}
