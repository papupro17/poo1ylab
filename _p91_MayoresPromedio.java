// Permitir que el usuario pida un numero n de numeros flotantes

import java.util.Scanner;

public class _p91_MayoresPromedio {
    public static void main(String[] args) {
        float n, suma=0, promedio=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Cuantos numeros quieres agregar?: "); n = obj.nextFloat();
        
        float[] nums = new float[(int) n];

        System.out.print("\nDame los numeros que quieras agregar en la lista "); 
        for (int i=0; i < nums.length; i++ ) {

            System.out.printf("\nNumero %d ", i+1);
            nums[i] = obj.nextFloat();
        }
        System.out.print("\nLos elementos del arreglo son\n" );
        for (float su : nums) {
            System.out.printf("%.2f ", su);
            suma = suma + su;
            
        }
        promedio = suma/nums.length;
        System.out.printf("\nLa suma de los numeros totales es de %.2f", suma);
        System.out.printf("\nEl promedio es de %.2f", promedio);
        
        int MayoresProm=0;
        System.out.print("\nLos numeros mayores al promedio son: ");
        for (float su : nums){
            if (su > promedio) {
                System.out.printf("\n%.2f",su); MayoresProm++;


            }
        }
System.out.printf("\nLos numeros mayores al promedio son %d ", MayoresProm );
    }

    
}