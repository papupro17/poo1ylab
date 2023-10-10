// Genera arreglos  aleatorios y los suma

import java.util.Random;

public class _p89_ArregloAleatorios {
    
    public static void Mostrar(Float[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.printf("%.2f ", a[i]);
        System.out.println();

    }

    public static void GeneraAleatorios(Float[] a) {
        float min=10.5f, max=41.5f;
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = Math.abs( rnd.nextFloat(max-min) ) + min;
    }
    public static void SumarArreglos(Float[] a, Float[] b, Float[] c) {
        for (int i = 0; i < a.length; i++)
            c[i] = a[i] + b[i];
    }
    public static void main(String[] args) {
        int MAX=15;
        Float[] nums1 = new Float[MAX];
        Float[] nums2 = new Float[MAX];
        Float[] nums3 = new Float[MAX];

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nPrimer arreglo de numeros aleatorios ");
        GeneraAleatorios(nums1); Mostrar(nums1);
        System.out.println("\nSegundo arreglo de numeros aleatorios");
        GeneraAleatorios(nums2); Mostrar(nums2);
        System.out.println("\nLa suma de los arreglos es ");
        SumarArreglos(nums1, nums2, nums3); Mostrar(nums3);




        }

    
    
}