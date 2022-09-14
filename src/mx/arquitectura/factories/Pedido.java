package mx.arquitectura.factories;

/**
 * @Class Pedido
 * */
public class Pedido {
    private double distancia;
    private Servicio servicio;
    private Vehiculo vehiculo;
    private Paquete paquete;
    private double total;

    public Pedido() {
    }

    /**
     * Constructor que crea una instancia de acuerdo a los parametros
     * @param distancia representa la distancia de la entrega
     * @param servicio representa el tipo de servicio
     * @param vehiculo representa el vehiculo del servicio
     * @param paquete representa el paquete.
     */
    public Pedido(double distancia, Servicio servicio, Vehiculo vehiculo, Paquete paquete) {
        this.distancia = distancia;
        this.servicio = servicio;
        this.vehiculo = vehiculo;
        this.paquete = paquete;
    }

    /**
     * regresa la distancia del pedido.
     * @return
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Establece el valor de la distancia dentro de la instancia.
     * @param distancia representa la distancia del pedido
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * devuelve el tipo de servicio
     * @return
     */
    public Servicio getServicio() {
        return servicio;
    }

    /**
     * Establece el Servicio
     * @param servicio Representa un tipo de servicio.
     */
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Regresa el tipo de vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el valor de Vehiculo
     * @param vehiculo Representa un tipo de vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Regresa el tipo de paquete
     * @return
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * Establece el tipo de paquete
     * @param paquete representa el tipo de paquete
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * devuelve el valor total del pedido.
     * @return
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el valor total del pedido
     * @param total Representa el costo total del pedido.
     */
    public void setTotal(double total){
        this.total = total;
    }

    /**
     * Regresa una cade con la descripcion del pedido.
     * @return
     */
    @Override
    public String toString() {
        return "Costo del servicio: $" + total
                + ", se entregara en " + vehiculo.toString();
    }
}
