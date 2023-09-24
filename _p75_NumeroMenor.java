// Funcion que pida 4 numeros y me devuela el numero menor

import java.util.Scanner;

public class _p75_NumeroMenor {
    public static void NumeroMenor (int n1, int n2, int n3, int n4) {
        if ( n1< n2 && n1 < n3 && n1 < n4) {
            System.out.print("El numero " + n1 + " es el menor\n");
            
        } else if ( n2 <= n1 && n2 <= n3 && n2 <= n4) {
            System.out.print("El numero " + n2 + " es el numero menor\n");
        } else if ( n3 <= n1 && n3 <= n2 && n3 <= n4) {
            System.out.print("El numero " + n3 + " es el numero menor\n");
    
        } else {
            
            System.out.print("El numero " + n4 + " es el numero menor\n");
        } 
        return;
        
    }
    
    
    
    public static void main(String[] args) {
        int n1,n2,n3,n4;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
         System.out.print("Dame 4 numeros enteros "); 
         n1 = obj.nextInt();
         n2 = obj.nextInt();
         n3 = obj.nextInt();
         n4 = obj.nextInt();

        NumeroMenor(n1, n2, n3, n4);
        
        
    }
    
}