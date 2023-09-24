// Imprimir secuencia de numeros en renglones que el usuario deseé

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int i,j,n; 
        Scanner obj = new Scanner(System.in);
             System.out.print("\033[H\033[2J");System.out.flush();
             System.out.print("De cuantos renglones?: "); n = obj.nextInt();

             System.out.print("Salida:\n");
        for ( i = 1; i<=n; i++) {
            for ( j = 1; j <= i; j++) {
                System.out.print(j + " ");

            }

            System.out.println();

        }       
        


               
    }
}
