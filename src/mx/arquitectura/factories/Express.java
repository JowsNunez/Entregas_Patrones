package mx.arquitectura.factories;

public class Express implements Servicio{
    public final double COSTO = 50;
    public double distancia;
    public Express(double distancia){
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
        return "Express{" +
                "COSTO=" + COSTO +
                ", distancia=" + distancia +
                '}';
    }
}
