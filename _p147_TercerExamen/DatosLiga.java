package _p147_TercerExamen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DatosLiga {
    private List<Jugador> listaJugadores;

    public DatosLiga() {
        this.listaJugadores = new ArrayList<>();
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void agregarJugador(Jugador jugador) {
        listaJugadores.add(jugador);
    }

    public void cargarDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            listaJugadores = (List<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos(String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(listaJugadores);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public double calcularTotalSalario() {
        double totalSalario = 0.0;
        for (Jugador jugador : listaJugadores) {
            totalSalario += jugador.getSalario();
        }
        return totalSalario;
    }
    
    public int contarHombres() {
        int contadorHombres = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getSexo() == 'H') {
                contadorHombres++;
            }
        }
        return contadorHombres;
    }
    
    public int contarMujeres() {
        int contadorMujeres = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getSexo() == 'M') {
                contadorMujeres++;
            }
        }
        return contadorMujeres;
    }
    
    public int contarSolteros() {
        int contadorSolteros = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getEstadoCivil().equalsIgnoreCase("soltero")) {
                contadorSolteros++;
            }
        }
        return contadorSolteros;
    }
    
    public int contarCasados() {
        int contadorCasados = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.getEstadoCivil().equalsIgnoreCase("casado")) {
                contadorCasados++;
            }
        }
        return contadorCasados;
    }
    
}
