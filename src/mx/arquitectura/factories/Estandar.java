package mx.arquitectura.factories;

public class Estandar implements Servicio{
    public final double COSTO = 30;
    public double distancia;
    public Estandar(double distancia){
        this.distancia = distancia;
    }
    @Override
    public double getCosto() {
        return this.COSTO;
    }

    @Override
    public double getDistancia() {
        return 0;
    }

    @Override
    public String toString() {
        return "Estandar{" +
                "COSTO=" + COSTO +
                ", distancia=" + distancia +
                '}';
    }
}
