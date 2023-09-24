// imprimir secuencia de numeros amonicos con su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        int n, i; 
        float suma, termino, div;
        Scanner obj = new Scanner(System.in);
        System.out.print("Cuantos términos?: "); n = obj.nextInt();

        suma = 0;

        System.out.print("Salida:\n ");
        
        for ( i = 1; i <= n; i++) {
            termino = 1.0f / i;
            suma+=termino;
        
            
            if ( i < n) {
                System.out.print("1/" + i + " + ");
            } else {
                System.out.print("1/" + i);
            }

        }

        System.out.println();
        System.out.printf("Suma: %f ",suma);
        
    }
    
}