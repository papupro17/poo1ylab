//
// Imprime numeros de 1 a n

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {
        int n,i,p;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los numeros de 1 a n");
        System.out.println("Hasta donde? "); n = obj.nextInt();
        System.out.println("Paso "); p = obj.nextInt();


        for(i=0; i <=n; i+=p) {
            System.out.printf("%d ",i);
        }

        //System.out.print(i);
        System.out.println("\nProceso terminado!");


        
    }





















}
