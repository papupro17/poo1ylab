package _p104_PuntoTriangulo;

public class Punto {
    private int X;
    private int Y;
    public Punto(int x, int y) {
        X = x;
        Y = y;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }

    public double getDistancia(Punto punto) { 
        double dx  = punto.getX() - X;
        double dy  = punto.getY() - Y;
        return Math.sqrt(dx * dx + dy * dy);

    }
    @Override
    public String toString() {
        return "Punto [X= " + X + ", Y= " + Y + "]";
    }
    
}