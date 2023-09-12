// Imprime numeros de N a 1 con paso de p

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {
        int n,i,p;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los numeros de n a 1");
        System.out.println("Desde donde? "); n = obj.nextInt();
        System.out.println("Paso "); p = obj.nextInt();


        for(i=n; i >=1; i-=p) {
            System.out.printf("%d ",i);
        }

        //System.out.print(i);
        System.out.println("\nProceso terminado!"); 
    }
    
}