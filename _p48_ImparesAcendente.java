// Imprimir numeros impares de forma ascendente

import java.util.Scanner;

public class _p48_ImparesAcendente {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char resp;

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            int n, Imp, Cont, Suma, Prom;

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Hasta dónde deseas llegar?\n ");
            n = obj.nextInt();

            Imp = 1;
            Cont = 0;
            Suma = 0;

            while (Cont < n) {
                if (Imp % 2 != 0) {
                    Suma += Imp;
                    System.out.println(Imp);
                }
                Imp += 1;
                Cont++;
            }

            Prom = Suma / (n / 2);
            System.out.println("La suma es de: " + Suma);
            System.out.println("El promedio es de: " + Prom);

            System.out.println("¿Desea continuar (S/N)?");
            resp =  Character.toUpperCase(obj.next().charAt(0));

        } while(resp != 'N');
        System.out.print("Adios amigo");
    }
}
