package _p108_Vehiculo;

public class Compacto {
    private int Pasajeros;
    private int Puertas;
    private Vehiculo vehiculo;

    public Compacto(Vehiculo vehiculo, int pasajeros, int puertas) {
        this.vehiculo = vehiculo;
        Pasajeros = pasajeros;
        Puertas = puertas;
    }

    public double getPrecio() {
        return vehiculo.getPrecio();
    }

    @Override
    public String toString() {
        return "Compacto [" + vehiculo + ", Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
}
