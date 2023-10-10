// Permita al usuario pedir n numeros enteros

import java.util.Scanner;

public class _p92_MayorMenor {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Cuantos numeros quieres agregar?: "); n = obj.nextInt();
        
        int[] nums = new int[(int) n];

        System.out.print("\nDame los numeros que quieras agregar en la lista "); 
        for (int i=0; i < nums.length; i++ ) {

            System.out.printf("\nNumero %d ", i+1);
            nums[i] = obj.nextInt();
        }
        System.out.print("\nLos elementos del arreglo son\n" );
        for (int su : nums) {
            System.out.print(su);
        
     }
     int mayor = nums[0];
     int menor = nums[0];

     for (int su : nums) {
        if (su > mayor) {
            mayor = su;
        } else if (su < menor) {
            menor = su;
            
        }
    }
        System.out.print("\nEl numero mayor es "+ mayor);
        System.out.print("\nEl numero menor es "+ menor);
    }
}