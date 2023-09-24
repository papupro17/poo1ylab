// se desea imprimir la secuencia de términos, el número de renglones que le usuario deseé

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
        int i, n, suma, numero;

        Scanner obj = new Scanner(System.in);
        suma = 0;
        numero = 1;
        System.out.print("Cuantos numeros deseas imprimir? "); n = obj.nextInt();
        
        for ( i = 1; i <=n; i++) {
            System.out.print(numero);
            suma += numero;

            if (i< n ) {
                System.out.print("+");

            }

            numero = numero * 10 + 1;
        }
         System.out.println("\nSuma:\n " + suma);
    }
    
}