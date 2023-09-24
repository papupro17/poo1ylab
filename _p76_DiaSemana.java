// Dia de la semana con letra pidiendo un numero del 1 al 7

import java.util.Scanner;

public class _p76_DiaSemana {

    public static void Semana(int n1) {
        if ( n1 > 7 || n1 < 1) {
            System.out.print("Tu numero esta fuera del rango!!!");
        } else {
            switch(n1) {
                case 1: 
                    System.out.print("Lunes"); break;
                case 2:
                    System.out.print("Martes"); break;
                case 3:
                    System.out.print("Miercoles"); break;
                case 4: 
                    System.out.print("Jueves"); break;
                case 5:
                    System.out.print("Viernes"); break;
                case 6:
                    System.out.print("Sabado"); break;
                case 7:
                    System.out.print("Domingo"); break;
                default:
                    System.out.print("Noooo, dale un numero nada máaaas"); 
                    break;
    
        }
        
        }

    }
    public static void main(String[] args) {
        int n1;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un numero solo entre el 1 al 7 "); n1 = obj.nextInt();
        
        Semana(n1);




        
    }
    
}