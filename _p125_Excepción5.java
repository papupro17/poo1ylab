import java.util.Scanner;

public class _p125_Excepción5 {
    public static void main(String[] args) {
        int a[] = {10,20,30,40};

        try {

            System.out.println("Qué posicion del arreglo quieres acceder ? "); int pos = new Scanner(System.in).nextInt();
            System.out.println("La posición " + pos + ", contiene el valor " + a[pos]);
        } catch (Exception e) {
            System.out.println("Estas accediendo una posición para los limites del arreglo ");
        } finally {
            System.out.println("Los elementos del arreglo son: ");
            for (int i : a) {
                System.out.print(i + "");
            }
        }

        
    }
    
}