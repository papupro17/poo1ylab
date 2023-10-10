// Leer un arreglo de n nombres y n edades, calcula el promedio de edades

import java.util.Scanner;

public class _p85_NombresEdades {
    public static void main(String[] args) {
        int n = 0, s = 0, p = 0;
        Scanner obj = new Scanner(System.in);
        
        
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nCuantas personas deseas procesar?"); n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edad = new int[n];

        System.out.printf("\nIntroduce los nombres y edades de las %d personas que dijiste ",n);
        for (int i=0; i < n; i++) {
            obj.nextLine();
            System.out.printf("Dame el nombre %d ", i+1); nombres[i] = obj.nextLine();
            System.out.printf("Dame la edad "); edad[i] = obj.nextInt();
        }
        System.out.println("\nLos nombres y las edades de las personas capturadas son:");
        System.out.printf("Nombre\tEdad\n");
        for (int i=0; i<n; i++) {
            System.out.printf("%s\t%d", nombres[i], edad[i]);
            s = s + edad[i];
        }
        p = s / n;
        System.out.println("\nEl promedioo de edades es " + p);


    }
    
}