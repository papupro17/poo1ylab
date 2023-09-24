// Imprime numeros pares e impares, y su suma

import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {
    int n, op,s;
    Scanner obj = new Scanner(System.in);
    do {
        System.out.println("[ 1 ] Impares ascendente");
        System.out.println("[ 2 ] Pares descendente");
        System.out.println("[ 3 ] Salir");
        System.out.print("Elije ? ");
        op = obj.nextInt();

        switch (op) {
            case 1:
                s = 0;
                System.out.println("Hasta donde deseas llegar? ");
                n = obj.nextInt();
                
                for (int i = 1; i <= n; i+=2) {
                    System.out.printf("%d ", i);
                    s += i;

                } 
                System.out.printf("\nLa suma de los numeros impares es : %d", s);
                break;
            case 2:
                s = 0;
                System.out.println("desde donde deseas descender?" );
                n = obj.nextInt();
                n = ( n  % 2 == 0 ? n : --n);
                for (int i = n; i >= 1; i-=2) {
                    System.out.printf("%d ", i);
                    s += i;
                } 
                System.out.printf("\nLa suma de los numeros pares es : %d", s);
                break;
            case 3:
                System.out.println("\nMMM, ok adiós");
            default:
                System.out.println("NOOO, eso es una opción INVALIDA, intentalo de nuevo");
        }

        System.out.println("\nPresiona <Enter> para continuar..");
        obj.nextLine();
    } while (op != 3);
    System.out.println("\nProceso terminado...");
    }
}
    
