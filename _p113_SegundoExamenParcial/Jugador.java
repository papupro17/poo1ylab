package _p113_SegundoExamenParcial;

abstract public class Jugador {


protected String Nombre;
protected char Sexo;
protected String Descripcion;
protected double Salario;
protected double Total;
public Jugador(String nombre, char sexo, String descripcion, double salario) {
    Nombre = nombre;
    Sexo = sexo;
    Descripcion = descripcion;
    Salario = salario;
}
protected abstract double getBono();
@Override
public String toString() {
    return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Descripcion=" + Descripcion + ", Salario=" + Salario
            + ", Total=" + Total + "]";
}
public char getSexo() {
    return Sexo;
}
}
