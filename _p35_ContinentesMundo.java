// Dado un numero entre 1 y 6 que todo numero tenga un continente

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.println("Dado un numero del 1 al 6, imprime el continente con letra\n");
        System.out.print("Dame un numero ");
        int conti = new Scanner(System.in).nextInt();

        switch (conti) {
            case 1 : System.out.print("Asia"); break;
            case 2 : System.out.print("África"); break;
            case 3 : System.out.print("America del Norte"); break;
            case 4 : System.out.print("America del Sur"); break;
            case 5 : System.out.print("Antártida"); break;
            case 6 : System.out.print("Europa"); break;
            default : System.out.print("Diste un numero invalido, vuelvo a intentarlo");
        }
        System.out.println("\nGracias por usar el programa");


        
    }
    
}