package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    

private String Nombre;
private String Liga;
private ArrayList<Jugador>Jugadores;
public Equipo() {
    Jugadores = new ArrayList<>();
}
public Equipo(String nombre, String liga) {
    Nombre = nombre;
    Liga = liga;
    
}
public void agregarJugador(Jugador jugador) {
    Jugadores.add(jugador);
}
public double getTotalBono() {
    double totalBono = 0;
    for (Jugador jugador : Jugadores) {
        totalBono += jugador.getBono();
        }
        return totalBono;
    }


public double getTotal() {
    double totalSalarios = 0;
    for (Jugador jugador : Jugadores) {
        totalSalarios += jugador.Total;
        }
        return totalSalarios;
}

public int getTotalHombres() {
    int totalHombres = 0;
    for(Jugador jugador : Jugadores) {
        if(jugador.getSexo() == 'H') {
            totalHombres++;
        }
    }
    return totalHombres;
}

public int getTotalMujures() {
    int totalMujeres = 0;
    for (Jugador jugador : Jugadores) {
        if(jugador.getSexo() == 'M') {
            totalMujeres++;
        }
    }
     return totalMujeres;
 }

 public void reporte() {
   for(Jugador jugador : Jugadores){
    System.out.println(">" + jugador);
   }
}
@Override
public String toString() {
    return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores + "]";
   }
}




