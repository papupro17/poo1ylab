package _p116_Juego;

import java.util.Scanner; 

public class JuegoDados implements Juego {
    private int Dado1;
    private int Dado2;
    private String Jugador1, Jugador2;
    private Scanner teclado;

    public JuegoDados() {
        teclado = new Scanner(System.in);

    }
    @Override
    public void iniciar() {
        System.out.println("Jugador 1: "); Jugador1 = teclado.nextLine();
        System.out.println("Jugador 2: "); Jugador2 = teclado.nextLine();
    }
    @Override
    public void jugar() {
        Dado1 = 1 + (int) (Math.random() * 6);
        Dado2 = 1 + (int) (Math.random() * 6);

        System.out.println(Jugador1 + " Le salio el valor de " + Dado1);
        System.out.println(Jugador2 + " Le salio el valor de " + Dado2);
    }
    @Override
    public void finalizar() {
        if(Dado1 > Dado2) System.out.println("Ganó " + Jugador1 + " con un valor de " + Dado1);
        else if (Dado2 > Dado1) System.out.println("Ganó " + Jugador2 + " con un valor de " + Dado2);
        else System.out.println("Empataron se tienen que golpear a muerte por favor, empataron con el valor de " + Dado1);
        
    }

    
}