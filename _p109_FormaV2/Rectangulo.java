package _p109_FormaV2;

public class Rectangulo extends Forma{
    private double Largo;
    private double Ancho;

    public Rectangulo(String color, boolean relleto, double largo, double ancho) {
        super(color, relleto);
        Largo = largo;
        Ancho = ancho;
    }
    public double getLargo() {
        return Largo;
    }

    public void setLargo(double largo) {
        Largo = largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }
    @Override
    public double getArea() {
        return Largo * Ancho;
    }

    @Override
    public double getPerimetro() {
        return (2 * Largo) + (2 * Ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [" + super.toString() + "Largo=" + Largo + ", Ancho=" + Ancho + "]";
    }

    


}