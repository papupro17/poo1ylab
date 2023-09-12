// Imprimir los primeros n numeros de la serie de fibbonaci

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
    System.out.print("\033[H\033[2J"); System.out.flush();
    Scanner obj = new Scanner(System.in);
    char resp;
    int maximo, a, b, c;
    a = 0;
    b = 1;
        do {
            System.out.print("Ingresa el valor máximo: "); maximo = obj.nextInt();
        
            System.out.println("Ingresa el valor máximo: ");

            while (a <= maximo) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

            System.out.println("\nQuiere seguir? (S/N): ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while(resp != 'N');
        System.out.print("Adios");
    }
}
