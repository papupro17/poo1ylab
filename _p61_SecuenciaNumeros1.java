// Imprimir secuencia de numeros en renglones que el usuario deseé

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int i,j,n; 
        Scanner obj = new Scanner(System.in);
             System.out.print("\033[H\033[2J");System.out.flush();
             System.out.print("De cuantos renglones?: "); n = obj.nextInt();

             System.out.print("Salida:\n");
        for ( i = 1; i<=n; i++) {
            for (j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

            for ( j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }       
        


               
    }
}