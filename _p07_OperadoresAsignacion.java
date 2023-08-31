// Efectua operaciones sobre un numero entero, usando los operadores de asignación

import java.util.Scanner;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // Limpia la pantalla de la consola
        
        System.out.print("dame un numero plis");
        float num=new Scanner(System.in).nextInt();

        System.out.printf("\nEl numero es : %.2f",num);
        System.out.printf(" Incrementar   : %.2f\n", ++num);
        System.out.printf(" Sumar 80      : %.2f\n", num+=80);
        System.out.printf(" restar 35     : %.2f\n", num-=35);
        System.out.printf(" Mult x 15     : %.2f\n", num*=15);
        System.out.printf(" Div / 4       : %.2f\n", num/=4);
        System.out.printf(" Decrementar   : %.2f\n", --num);

        
    }
    
}
