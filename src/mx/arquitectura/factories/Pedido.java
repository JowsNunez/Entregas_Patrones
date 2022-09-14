package mx.arquitectura.factories;

public class Pedido {
    private double distancia;
    private Servicio servicio;
    private Vehiculo vehiculo;
    private Paquete paquete;
    private double total;

    public Pedido() {
    }

    public Pedido(double distancia, Servicio servicio, Vehiculo vehiculo, Paquete paquete) {
        this.distancia = distancia;
        this.servicio = servicio;
        this.vehiculo = vehiculo;
        this.paquete = paquete;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    @Override
    public String toString() {
        return "Costo del servicio: " + total
                + ", se entregara en " + vehiculo.toString();
    }
}
