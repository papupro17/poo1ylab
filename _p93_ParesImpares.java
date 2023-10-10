// Programa de pares e impares

public class _p93_ParesImpares {
    public static void main(String[] args) {
        int[] a = {11, 2, 13, 12, 3};
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 1;
        }  

        System.out.print("\nPrimer arreglo ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        System.out.print("\nSegundo arreglo ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        
        int conta = 0;
        System.out.println("Elementos pares del Arreglo A");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " ");
                conta++;
            }
        }
        System.out.println("La cantidad es de " + conta);

        int contb = 0;
        System.out.println("Elementos pares del Arreglo B");
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                System.out.println(b[i] + " ");
                contb++;
            }
        }
        System.out.println("La cantidad es de " + contb);

        System.out.println("Elementos impares del Arreglo A");
        int contai = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i] + " ");
                contai++;
            }
        }
        System.out.println("La cantidad es de " + contai);

        System.out.println("Elementos impares del Arreglo B");
        int contbi = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                System.out.println(b[i] + " ");
                contbi++;
            }
        }
        System.out.println("La cantidad es de " + contbi);
    }
}