package _p108_Vehiculo;

public class Camioneta {
    private Double Capacidad;
    private int Ejes;
    private Vehiculo vehiculo;

    public Camioneta(Vehiculo vehiculo, Double capacidad, int ejes) {
        this.vehiculo = vehiculo;
        Capacidad = capacidad;
        Ejes = ejes;
    }

    public double getPrecio() {
        return vehiculo.getPrecio();
    }

    @Override
    public String toString() {
        return "Camioneta [" + vehiculo + ", Capacidad=" + Capacidad + ", Ejes=" + Ejes + "]";
    }
}