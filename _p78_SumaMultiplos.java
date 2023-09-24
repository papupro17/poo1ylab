// Suma de multiplos con una constante de 3 o 4

import java.util.Scanner;

public class _p78_SumaMultiplos {
    
    public static boolean RangoValidar(int ini, int fin) {
        return ini < fin;
    }

    public static int sumaMultiplos(int ini, int fin, int constante) {
        int suma = 0;
        for (int num = ini; num <= fin; num++) {
            if (num % constante == 0) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ini, fin, constante;
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Ingrese el valor inicial: ");
        ini = obj.nextInt();
        System.out.print("Ingrese el valor final: ");
        fin = obj.nextInt();
        System.out.print("Ingrese la constante (3 o 4): ");
        constante = obj.nextInt();
        
        if (RangoValidar(ini, fin)) {
            int suma = sumaMultiplos(ini, fin, constante);
            System.out.println("La suma de los múltiplos de " + constante + " en el rango (" + ini + ", " + fin + ") es: " + suma);
        } else {
            System.out.println("El rango ingresado no es válido.");
        }
        
        
    }


}
    